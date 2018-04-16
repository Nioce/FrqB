
/**
 * Andrew wilomovsky
 * tester class
 */
public class tester
{
    /**
     * Test functions
     * @parm none
     * @return args 
     */
    public static void main(String[] args){
        Advance regularad = new Advance(20);
        StudentAdvance studentad = new StudentAdvance(20);
        
        Walkip justwalken= new Walkip();
        
        System.out.println(studentad);
        System.out.println(regularad.getPrice());
        System.out.println(regularad);
        System.out.println(studentad.getPrice());
        System.out.println(justwalken.getPrice());
        System.out.println(justwalken);
        //System.out.println(studentad.getNextSerialNumber());
    }
}
