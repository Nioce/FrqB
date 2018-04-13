
/**
 * Write a description of class Drink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drink implements Menu 
{
    private String drink;
    private double price;
    public Drink(String drink, double price){
        this.drink = drink;
        this.price = price;
    }
    
    public String getName(){
        return drink;
    }
    
    public double getPrice(){
        if(drink == "Orange Soda"){
            return 1.25;
        }
        return 3.50;
    }
}
