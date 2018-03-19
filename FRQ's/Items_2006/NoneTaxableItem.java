
/**
 * Write a description of class NoneTaxableItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class NoneTaxableItem implements Item
{
    public double NoneTaxableItem(){
        return purachasePrice();
    }
}
