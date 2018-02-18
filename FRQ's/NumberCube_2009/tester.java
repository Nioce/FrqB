
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(){
        String name = "aaa";
        int[] vlrnt1 = {1,2,3,5,5,5,3,3,3,3};
        int[] vlrnt2 = {1,2,3,5,5,5,1,1,4,6,4,6,6,6,6,6,6,5,5,4};
        int[] vlrnt3 = {1,2,3,1,1,4,6,4,6,5,5,5,5,5,5,4};

        System.out.println(NumberCube.getLongestRun(vlrnt1));
        System.out.println(NumberCube.getLongestRun(vlrnt2));
        System.out.println(NumberCube.getLongestRun(vlrnt3));
    }
}
