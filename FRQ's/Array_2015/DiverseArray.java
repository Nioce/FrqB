import java.util.ArrayList;

import java.util.Arrays;
public class DiverseArray
{
    public static int arraySum(int array [] ){
        int sum=0;
        for(int i=0; array[i]>i; i++){
            sum+=array[i];
        }
        return sum;
    }
    
    public static int[] rowSums(int array[][]){
        ArrayList<Integer> sumsrow = new ArrayList<Integer>();
        int sum[] = {};
        
        for(int row = 0; row<array[row][0]; row++){
            for(int col=0; col<array[col][0];col++){
                sumsrow.add(array[row][col]);
            }
        }
        for(int i=0;sumsrow.size()>i;i++){
            sum[i] = sumsrow.get(i);
        }
        return sum;
    }
}
