
/**
 * Write a description of class Trio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trio implements Menu
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich =sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    
    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    public double getPrice(){
        double total = 0;
        if(sandwich.getPrice() <= salad.getPrice() && sandwich.getPrice() <= drink.getPrice()){
            total = salad.getPrice() + drink.getPrice();
        }
        
        if(drink.getPrice() <= salad.getPrice() && drink.getPrice() <= sandwich.getPrice()){
            total = salad.getPrice() + drink.getPrice();
        }
        return total;
    }
}
