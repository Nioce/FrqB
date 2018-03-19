import java.util.ArrayList;
/**
 * Write a description of class PetTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetTester
{
    public static void main(String[] args){
        Pet p1 = new Dog("Rex");
        Pet p3 = new Dog("Rex");
        Pet p2 = new Dog("Rex");
        Pet p4 = new LoudDog("Borjok");
        
        ArrayList<Pet> allPets = new ArrayList<Pet>();
        allPets.add(p1);
    }
}