
/**
 * Write a description of class TaxableItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class TaxableItem implements Item
{
    private double taxRates;
    public TaxableItem(double rate){
    taxRates = rate;}
    public abstract double getListPrice();
    
        
    public double purachasePrice(){
        return getListPrice() * (1.0 + taxRates);
    }
    
    
}
