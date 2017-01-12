
import java.util.*;

public class ArrayList_03
{
    public static void main(String[] args) {
        ArrayList<Integer> myNums = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int foo = (int) (Math.random() * 3) + 1;
            myNums.add(foo);
        }

        System.out.println("\nUsing a regular for loop to print ArrayList");
        for (int i =0; i < myNums.size(); i++) {
            System.out.print(myNums.get(i) + " ");
        }
    }
}