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
        Pet p3 = new Dog("Lol");
        Pet p2 = new Cat("Bbb");
        Pet p4 = new LoudDog("Borjok");
        
        ArrayList<Pet> allPets = new ArrayList<Pet>();
        allPets.add(p1);
        allPets.add(p2);
        allPets.add(p3);
        allPets.add(p4);
        
        Kennel kennel = new Kennel(allPets);
        kennel.allSpeak();
    }
}