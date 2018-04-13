
/**
 * Write a description of class Salad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Salad implements Menu 
{
    private String salad;
    private double price;
    public Salad(String sandwich, double price){
        this.salad = salad;
        this.price = price;
    }
    
    public String getName(){
        return salad;
    }
    
    public double getPrice(){
        if(salad == "Coleslaw"){
            return 1.25;
        }
        return 1.25;
    }
}
