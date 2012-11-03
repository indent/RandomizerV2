/**
 * Andrew Killingsworth
 * console data randomizer
 * 
 */
import java.util.Random;

public class Numbers {
    
    private int[] x = new int[1000];
    private int[] y = new int[1000];
    private int[] z = new int[1000];
    
    public Numbers(){
        
        x[0] = 0;
        y[0] = 0;
        z[0] = 0;
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
    
}
