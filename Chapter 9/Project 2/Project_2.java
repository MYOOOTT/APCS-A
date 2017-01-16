import java.util.*;

public class Project_2
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int SIZE = 10;
        float[] list = requestFloatingList(SIZE);

        float average = calculateAvg(list);

        int higher = countHigher(list, average);

        float[] higherThanAverage = createArray(list, average, higher);

        System.out.println("These are higher than the average: " );
        printArray(higherThanAverage);
    }

    private static void printArray(float[] list) {
        
        for (int k = 0; k < list.length; k++) {
            System.out.println(list[k]);
        }
    }

    //counts how many numbers are higher than the average so that the list size can be set
    private static int countHigher(float[] list, float average) {
        int higher = 0;
        for (int i = 0; i< list.length; i++) {
            if (list[i] > average) {
                higher++;
            }
        }
        return higher;

    }

    private static float[] createArray(float[] list, float average, int higher) {
        float[] higherThanAverage = new float[higher];
        int higherPlace = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > average) {
                higherThanAverage[higherPlace] 
                = list[i];
                higherPlace++;
            }

        }
        return higherThanAverage;
    }

    private static float[] requestFloatingList(int size) {
        float[] list = new float[10];
        Scanner reader = new Scanner(System.in);
        float total = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.print("list[" + i + "] = ");
            float input = reader.nextInt();
            list[i] = input;

        }
        return list;

    }

    private static float calculateAvg(float[] list) {
        float total = addList(list);
        float average = total / list.length;
        System.out.println(total + " / " + list.length + " = " + average + " (average) " + "\n");
        return average;
    }

    //helper method for calculateAvg
    private static float addList(float[] list) {
        float total = 0;
        for (float i : list) {
            total += i;
        }
        return total;
    }	
}