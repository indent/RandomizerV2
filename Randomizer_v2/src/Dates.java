/**
 * Andrew Killingsworth
 * console data randomizer
 * 
 */
import java.util.Random;

public class Dates {
    
    private int dd;
    private int mm;
    private int yy;
    
    public Dates() {
        
        dd = 0;
        mm = 0;
        yy = 0;
    }
    
    // Doesn't check for feb OOR date
    public void theDate(int dMax, int dMin, int mMax, int mMin, int numData, int year){
        
        Random rand = new Random();
        
        for(int i=0;i<numData;i++) {
            dd = rand.nextInt(dMax - dMin + 1) + dMin;
            mm = rand.nextInt(mMax - mMin + 1) + mMin;
            yy = year;
            System.out.println(mm+"/"+dd+"/"+yy);
        }
    }
}
