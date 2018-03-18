
/**
 * Write a description of class Advance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class  Advance extends Ticket 
{
   private int day;
   public Advance(int day){
       this.day=day;
   }
   
   public double getPrice(){
       if(day > 10){
          return 30;  
       }
       return 40;
   }
}
