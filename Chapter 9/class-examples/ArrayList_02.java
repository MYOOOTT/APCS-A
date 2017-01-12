import java.util.*;

public class ArrayList_02
{
    public static void printAL(ArrayList<String> a1) {
        System.out.println("\nPrinting arrayList");
        
        //use an enhanced for loop to print the list
        for (String thing : a1) {
            System.out.print(thing + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Sing");
        myList.add("Wing");
        myList.add("Bing");
        myList.add("King");
        printAL(myList);
        myList.set(2, "Number2");
        printAL(myList);
        myList.set(2, "InsertedAt2");
        printAL(myList);
    }
}