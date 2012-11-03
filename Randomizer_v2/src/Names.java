/**
 * Andrew Killingsworth
 * console data randomizer
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Names {

    private String[] lNames = new String[88800];
    private String[] fNames = new String[5495];
    
    public Names(){
        
        lNames[0] = "";
        fNames[0] = "";
    }
    
    public void setLastNames(String[] newLastNames){
        
        Scanner inStream = null;
        
        try {
            inStream = new Scanner(new FileInputStream("lastNames.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File could not be found!");
            System.exit(0);
        }
        
        for(int i=0;i<88800;i++) {
            newLastNames[i] = inStream.nextLine();
        }
        
        for(int i=0;i<88800;i++) {
            lNames[i] = newLastNames[i];
        }
    }
    
    public void setFirstNames(String[] newFirstNames){
        
        Scanner inStream = null;
        
        try {
            inStream = new Scanner(new FileInputStream("firstNames.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File could not be found!");
            System.exit(0);
        }
        
        for(int i=0;i<5495;i++) {
            newFirstNames[i] = inStream.nextLine();
        }
        
        for(int i=0;i<5495;i++) {
            fNames[i] = newFirstNames[i];
        }
    }
    
    public void printLastNames(int numData){
        
        for(int i=0;i<numData;i++) {
            System.out.println(lNames[i]);
        }   
    }
    
    public void printFirstNames(int numData){
        
        for(int i=0;i<numData;i++) {
            System.out.println(fNames[i]);
        }
    }
    
    public void printRandFirstNames(int numData){
        
        Random rand = new Random();
        int max = 5495;
        int min = 1;
        for(int i=0;i<numData;i++) {
            int r = rand.nextInt(max - min + 1) + min;
            System.out.println(fNames[r]);
        }
    }
    
    public void printRandLastNames(int numData){
        
        Random rand = new Random();
        int max = 88800;
        int min = 1;
        for(int i=0;i<numData;i++) {
            int r = rand.nextInt(max - min + 1) + min;
            System.out.println(lNames[r]);
        }
    }
    
    public void printRandFullNames(int numData){
        
        Random rand = new Random();
        int max = 5495;
        int min = 1;
        for(int i=0;i<numData;i++) {
            int r = rand.nextInt(max - min + 1) + min;
            int d = rand.nextInt(88800 - 1 + 1) + 1;
            System.out.println(fNames[r] + " " + lNames[d]);
        }
    }
}
