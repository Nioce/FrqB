import java.util.ArrayList;
/**
 * Write a description of class Kennel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kennel
{
    private ArrayList<Pet> petList;
    public void allSpeak(){
        this.petList = petList;
    }
    
    public void allPeak(){
        for(Pet p : petList){
            System.out.println(p.getName() + ": " + p.speak());
        }
    }
}
