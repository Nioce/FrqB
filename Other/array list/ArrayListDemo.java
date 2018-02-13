import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] twelve)
    {
        ArrayList<String> fruit = new ArrayList<String>();
        
        // How many things are in it?
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());
                
        // We can add objects to the array one at a time
        fruit.add("apple");
        fruit.add("cucumber");
        fruit.add("apple");
        fruit.add("grape");
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("cucumber");
        fruit.add("pear");
        
        // How many things are in it now?
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());

        // ArrayLists have useful toString methods
        System.out.println(fruit);

        // We can access individual elements.
        System.out.println(fruit.get(3));

        // Items can be found
        System.out.println(fruit.indexOf("cucumber"));
        
        // More items can be added
        fruit.add("kiwi");
        fruit.add(4, "watermelon");
        // Items can be removed
        System.out.println(fruit.remove("pear"));   
        System.out.println(fruit.remove(2));
        
        // Or we can overwrite elements
        fruit.set(0, "jalapeno");
            
        // Just checking
        System.out.println(fruit);
        
        // we can also traverse ArrayLists with loops
        for (int i=0; i<fruit.size(); i++)
            System.out.println(fruit.get(i));
            
        for (String f : fruit)
            System.out.println(f);
            
        for (String f : fruit)
            f = "guava";

        System.out.println(fruit);
        
        
        for (int i=0; i<fruit.size(); i++)
            fruit.set(i, "guava");
            
        System.out.println(fruit);
    }
}