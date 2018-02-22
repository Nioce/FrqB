import java.util.ArrayList;
/**
 * Write a description of class Digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Digits
{
    private ArrayList<Integer> digitList;
    
    public Digits(int num){
        digitList = new ArrayList<Integer>();
        /*
        String numsl = Integer.toString(num);
        int tnum = num;
        int whnum = num;
        for(int i = 0; numsl.length()>i;i++){
            if(num==0){
                digitList.add(0);
            }
            while(tnum > 10){
                tnum = tnum % 10;
            }
            digitList.add(0, new Integer(tnum));
            whnum= whnum/10;
            tnum=whnum;
        }
        */
       
       if(num == 0){
           digitList.add(0);
       }
            
       while (num > 0) {
           digitList.add(0, num % 10);
           num /= 10;
       }
    
       
    }
    
    public String toString() {
        return digitList.toString();
    }
}
