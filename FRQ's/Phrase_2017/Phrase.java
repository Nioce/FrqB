package Phrase_2017;



/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phrase
{
    private String currentPhrase;
    public Phrase(String p){
        currentPhrase = p;
    }
    
    public int findNthOccurence(String str, int n){
        int count = 0;
        int i = 0;
        while(count<n && currentPhrase.indexOf(str, i)>-1){
            count++;
            i = currentPhrase.indexOf(str, i+1);
        }
        return i;
    }
       
    
    public void replaceNthOccurence(String str, int n, String rpl){
        String temp = "";
        String tempprev = "";
        int loc= findNthOccurence(str, n);
        String before = currentPhrase.substring(0,loc);
        String after = currentPhrase.substring(loc,currentPhrase.length());
        currentPhrase = before + rpl + after;
    }
    
    public int findLastOccurence(String str){
        return currentPhrase.lastIndexOf(str);
    }
    
    public String toString(){
        return currentPhrase;}
}
