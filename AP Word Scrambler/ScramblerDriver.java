/** You do not need to make any changes to this driver
 * all code should be written within the WordScrambler class
 **/
 
import java.util.*;

public class ScramblerDriver
{
    public static void main(String[] args) {
        String[] words = { "TAN", "ABRACADABRA",
            "WHOA", "AARDVARK", "EGGS", "A", "" };      
        for (int i=0; i<words.length; i++) {
            words[i] = WordScrambler.scrambleWord(words[i]);
            System.out.println(words[i]);
        }     
    }    
}
