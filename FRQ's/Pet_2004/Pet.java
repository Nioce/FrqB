
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Pet
{
    private String myName;
    
    public Pet(String name){
        myName = name;
    }
    
    public String getName(){
        return myName;
    }
    
    public abstract String speak();
    
}
