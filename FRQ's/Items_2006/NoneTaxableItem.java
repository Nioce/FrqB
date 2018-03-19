/**
* Andrew wilomovsky
* Class for nonetaxbale items, item subclass
*/
public abstract class NoneTaxableItem implements Item
{
    /**
     * Returns the cost for a none taxable item
     * @parm none
     * @return double 
     */
    public double NoneTaxableItem(){
        return purachasePrice();
    }
}
