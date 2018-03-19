
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{
    private double cost;
    private double markup;
    
    public Vehicle(double cost, double markup, double rate){
        super(rate); 
        this.cost=cost;
        this.markup=markup;
    }
    
    public double getListPrice(){
        return cost+markup;
    }
    
}
