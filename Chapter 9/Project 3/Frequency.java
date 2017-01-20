import java.util.*;

public class Frequency
{
    private int mode;
    private int[] list = new int[10];
    private int[][] frequencies;
    private int numberOfPotentialModes = 0;
    public Frequency() {
        System.out.println("Please input 10 INTEGERS.");
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.nextInt();
        }
        printList();
        Arrays.sort(list);
    }

    private  void printList() {
        for (int i = 0; i < list.length; i++) {
            System.out.println("[" + i + "] = " + list[i]);
        }
    }

    private void sortArray() {
        System.out.println("Sorting the array...");
        System.out.println("This is the sorted array.");
        printList();
        Arrays.sort(list);
    }

    public int findMode() {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[j] == list[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = list[i];
            }
        }

        return maxValue;

    }

    //LIST HAS TO BE SORTED FIRST!!!!!!!
    //creates the frequency table
    //column 0 = actual number
    //column 1 = frequency
    public int[][] count() {
        //just in case that the array has 10 unique numbers
        int[][] frequency = new int [10][2];
        int count = 0;
        int indexPos = 0;
        for (int i = 0; i < list.length; i++) {
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if (i != 0 && list[i] == list[i - 1]) {                
                    break;
                }
                if (list[j] == list[i]) {
                    count++;
                }
            }
            if (count >= 1) {
                frequency[indexPos][0] = list[i];
                frequency[indexPos][1] = count;
                indexPos++;
            }
        }

        return frequency;
    }

    public double findMedian() {
        double median;
        if (list.length % 2 == 0) {
            int half1 = list.length / 2;
            int half2 = half1 - 1;

            median = (list[half1] + list[half2]) / 2.0;
            return median;
        } else {
            int half = list.length / 2 - 1;
            int middle = list.length - half;
            median = middle;
            return median;
        }
    }

    //assumes the table has 2 COLUMNS!!!!
    public void printTable(int[][] array) {
        System.out.println("Number\tFrequency");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                if(array[i][j] != 0){
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

}

