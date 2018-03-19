
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  abstract class Vehicle extends TaxableItem implements Item
{
    private double cost;
    private double markup;
    public Vehicle(double cost, double markup, double rate){
        super(rate); 
        cost=this.cost;
        markup=this.markup;
    }
    
    public double getPrice(){
        return cost+markup;
    }
    
}
