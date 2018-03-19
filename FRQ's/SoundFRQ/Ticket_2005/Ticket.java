import java.util.Random;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    private int serialNumber;
    public Ticket(){
        serialNumber = getNextSerialNumber();}
    
    public abstract double getPrice();
    public String toString(){
        return "Number : " + serialNumber + " \nPrice:" + getPrice();
    }
    
    private static int getNextSerialNumber(){
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        return n;
    }
}
