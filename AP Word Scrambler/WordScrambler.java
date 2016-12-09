import java.util.*;

public class WordScrambler
{
    public static String scrambleWord(String word) {
        String part1 = "", part2 = "", middle = "", intermediateWord = word;
      
        for (int i = 0; i <= word.length()-1; i++) {
            
            if (word.charAt(i) == 'A' 
            && i < word.length() -1 
            && i != word.length() -1 
            && word.charAt(i + 1) != 'A') {

                part1 = intermediateWord.substring(0, i);
                middle = intermediateWord.substring(i, i + 2);
                part2 = intermediateWord.substring(i + 2);
                
                String combinedWord = switchChars(part1, middle, part2);
                intermediateWord = combinedWord;
            } 
            
        }
        return intermediateWord;
    }

    private static String switchChars(String firstHalf, String middle, String secHalf) {
        char a = 'A';
        char b;
 
        b = middle.charAt(1);
        middle = "" + b + a;

        String combinedWord = firstHalf + middle + secHalf;
        return combinedWord;
    }
}
