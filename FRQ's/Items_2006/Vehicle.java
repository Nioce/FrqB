
/**
 * Andrew Wilomovsky
 * Sets up vechical cost including <item>
 */
public class Vehicle extends TaxableItem
{
    private double cost;
    private double markup;
    
    /**
     *constructor method for class
     *@parm double cost, double markup, double rate
     *@return none
     */
    public Vehicle(double cost, double markup, double rate){
        super(rate); 
        this.cost=cost;
        this.markup=markup;
    }
    
    /**
     * Gets the price of car based off markup and orignal cost
     * @parm none
     * @return double
     */
    public double getListPrice(){
        return cost+markup;
    }
    
}
