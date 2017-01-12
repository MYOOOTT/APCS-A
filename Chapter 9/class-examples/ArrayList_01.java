import java.util.*;

public class ArrayList_01
{
    public static void main(String[] args) {
        ArrayList<Integer> myAList = new ArrayList<Integer>();
        for (int k = 0; k < 20; k++) {
            int element = (int) (Math.random() * 100) + 1;
            myAList.add(element);
        }
        
        for (int k = 0; k < myAList.size(); k++ ) {
            System.out.println("myAList element #" + k + " is " + myAList.get(k));
        }
        System.out.println();
    }
}