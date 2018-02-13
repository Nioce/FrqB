package Phrase_2017;


/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args){
        Phrase phrase1 = new Phrase("A cat ate late.");
        
        System.out.println(phrase1.findNthOccurence("at",1));
        System.out.println(phrase1.findNthOccurence("at",3));
        System.out.println(phrase1.findNthOccurence("at",2));
        System.out.println(phrase1);
        
        phrase1.replaceNthOccurence("at",3,"xx");
        System.out.println(phrase1);

      
        
    }
}
