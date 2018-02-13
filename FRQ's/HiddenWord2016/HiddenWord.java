 


/**
 * Write a description of class HiddenWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HiddenWord
{
    String word;
    public HiddenWord(String word){
        this.word=word;
    }
    
    public String getHint(String guess){
        String result ="";
        for(int n = 0; word.length() > n; n++){
            if(word.charAt(n) == guess.charAt(n) ){
                result += word.charAt(n);
            }
            else if(word.indexOf(guess.charAt(n)) != -1){
                result += "+";
            }
            else{
                result += "*";
            }
        }
        return result; 
    }
}
