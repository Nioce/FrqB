
/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich implements Menu 
{
    private String sandwich;
    private double price;
    public Sandwich(String sandwich, double price){
        this.sandwich = sandwich;
        this.price = price;
    }
    
    public String getName(){
        return sandwich;
    }
    
    public double getPrice(){
        if(sandwich == "Cheeseburger"){
            return 2.75;
        }
        return 2.75;
    }
}
