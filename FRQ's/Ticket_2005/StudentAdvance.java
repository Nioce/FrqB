
/**
 * Write a description of class StudentAdvance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvance extends Advance
{
    public StudentAdvance(int day){
        super(day);
    }
    public double getPrice(){
        return (super.getPrice())/2;
    }
    public String toString(){
        return super.toString() + " Student id needed";
    }
}
