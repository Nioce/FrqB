
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args){
        Vehicle subaru = new Vehicle(20000.00, 2500.00, 0.10);
        System.out.println(subaru.getListPrice());
        System.out.println(subaru.purachasePrice());
        
    }
}
