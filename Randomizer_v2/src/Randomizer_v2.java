/**
 * Andrew Killingsworth
 * console data randomizer
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Randomizer_v2 {
    
    public static void main(String[] args) {
               
        Scanner keyboard = new Scanner(System.in);
        Names aName = new Names();
        Numbers aNumber = new Numbers();
        Dates aDate = new Dates();
        int max, min, numData, mMax, mMin, year;
        String[] f = new String[5495];
        String[] l = new String[88800];
        
        
        System.out.println("Data Randomizer V2");
        System.out.println("1: Random Number Generator");
        System.out.println("2: Random First Name Generator");
        System.out.println("3: Random Last Name Generator");
        System.out.println("4: Random Full Name Generator");
        System.out.println("5: Random Date Generator");
        System.out.println("6: Exit");
        System.out.println();
        System.out.println("Please select a number from the menu");
        int choice = keyboard.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter a max, min, and the number of data you need.");
                max = keyboard.nextInt();
                min = keyboard.nextInt();
                numData = keyboard.nextInt();
                System.out.println("==");
                aNumber.setNumbers(max, min, numData);
                aNumber.printNumbers(numData);
                break;
            case 2:
                System.out.println("Enter the number of first names you would like to create.");
                numData = keyboard.nextInt();
                aName.setFirstNames(f);
                aName.printRandFirstNames(numData);
                break;
            case 3:
                System.out.println("Enter the number of last names you would like to create.");
                numData = keyboard.nextInt();
                aName.setLastNames(l);
                aName.printRandLastNames(numData);
                break;
            case 4:
                System.out.println("Enter the number of full names you would like to create.");
                numData = keyboard.nextInt();
                aName.setLastNames(l);
                aName.setFirstNames(f);
                aName.printRandFullNames(numData);
                break;
            case 5:
                System.out.println("Enter the max range or days followed by the minimum"
                        + "\n then enter the max range of months followed by the min.");
                max = keyboard.nextInt();
                min = keyboard.nextInt();
                mMax = keyboard.nextInt();
                mMin = keyboard.nextInt(); 
                System.out.println("Enter the year of the random dates.");
                year = keyboard.nextInt();
                System.out.println("Enter the number of data you would like listed.");
                numData = keyboard.nextInt();
                aDate.theDate(max, min, mMax, mMin, numData, year);
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Please enter a valid number from the list.");
        }
        
    }
}
