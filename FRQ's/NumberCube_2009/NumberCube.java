import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class NumberCube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberCube
{   
    private String name;
    public NumberCube(String name){
        this.name=name;
    }
    public int toss(){
        Random rand = new Random();

        int  n = rand.nextInt(6) + 1;
        return n;
    }

    public int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] tosses = new int[numTosses];
        for (int i = 0; numTosses>i ; i++){
            tosses[i] = cube.toss(); 
            
        }
        return tosses;
    }
    
    public static int getLongestRun(int[] values){
        int vs= values.length;
        int maxv = -1;
        int curentv = 1;
        for(int i=0; vs - 1 >i; i++){
            if(values[i] == values[i+1]){
                for(int n =i+1; vs > n; n++){
                    if(values[i] == values[n]){
                        curentv++;
                    }
                    else{
                        n =+ vs;
                    }
                }
            }
            if(maxv<curentv){
                maxv = curentv;
            }
            curentv = 1;
        }
        return maxv;
    }
}
