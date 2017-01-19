import java.util.*;

public class Mode
{
    int mode;
    int[] list = new int[10];
    public Mode() {
        System.out.println("Please input 10 INTEGERS.");
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.nextInt();
        }

        printList();
    }

    private  void printList() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("[" + i + "] = " + list[i]);
        }
    }

    public int[] getList() {
        return list;
    }

    public int findMode(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorting the array...");
        System.out.println("This is the sorted array.");
        printList();
        int count1 = 0, count2 = 0;
        mode = array[0];
        for (int i = 1; i < array.length; i++) {
            if (list[i] == list[i - 1]) {
                count1++;
            } else {
                count1 = 0;
            }
            if (count1 >= count2) {
                mode = array[i];
                count2 = count1;

            }
        }
        
        return mode;

    }
}
