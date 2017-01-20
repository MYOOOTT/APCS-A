import java.util.*;

public class ArrayList_08
{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        
        System.out.println("\nAdding some things");
        myList.add("Thing1");
        myList.add("Thing2");
        
        System.out.println("\nChecking if the ArrayList contains Thing1...");
        System.out.println(myList.contains("Thing1"));
        
        System.out.println("\nChecking if the ArrayList contains Cat...");
        System.out.println(myList.contains("Cat"));
    }
}