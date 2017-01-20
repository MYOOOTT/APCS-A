import java.util.*;

public class ArrayList_09
{
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        System.out.println("\nAdding some Integers...");
        Random rand = new Random();
        
        for (int i = 0; i < 16; i++) {
            numList.add(rand.nextInt(10));
        }
        
        System.out.println("\nPrinting the ArrayList...");
        System.out.println(numList);
    }
}