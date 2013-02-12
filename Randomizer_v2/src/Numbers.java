/**
 * Andrew Killingsworth
 * console data randomizer
 * 
 */
<<<<<<< HEAD
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
=======
import java.util.Random;
>>>>>>> 3425f727dabe48694956b78bf5151ef9aa4fd6ec

public class Numbers {
    
    private int[] x = new int[1000];
    private int[] y = new int[1000];
    private int[] z = new int[1000];
<<<<<<< HEAD
    private String[] b = new String[1000];
=======
>>>>>>> 3425f727dabe48694956b78bf5151ef9aa4fd6ec
    
    public Numbers(){
        
        x[0] = 0;
        y[0] = 0;
        z[0] = 0;
<<<<<<< HEAD
        b[0] = "";
=======
>>>>>>> 3425f727dabe48694956b78bf5151ef9aa4fd6ec
    }
    
    public void setNumbers(int max, int min, int numData) {
        
        Random rand = new Random();
        int[] newX = new int[1000];
        
        for(int i=0;i<numData;i++){
            newX[i] = rand.nextInt(max - min + 1) + min;
            x[i] = newX[i];
        }
    }
    
    public void printNumbers(int numData) {
        
        for(int i=0;i<numData;i++) {
            System.out.println(x[i]);
        }
    }
    
<<<<<<< HEAD
    public boolean specialNum(int numRep) {
        Scanner inStream = null;
        
        try {
            inStream = new Scanner(new FileInputStream("Special.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File could not be found!");
            return false;
        }
        
        int i=0;
        while(inStream.hasNext()) {
            b[i] = inStream.next();
            i++;
        }
        int items = i-1;
        Random rand = new Random();
        for(int j=0;j<numRep;j++) {
            System.out.println(b[rand.nextInt(items-0+1)+0]);
        }
        
        return true;
    }
=======
>>>>>>> 3425f727dabe48694956b78bf5151ef9aa4fd6ec
}
