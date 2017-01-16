import java.util.*;

public class Project_2
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float[] list = new float[10];
        float average = 0, total = 0;
        int higher = 0, higherPlace = 0;
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("list[" + i + "] = ");
            float input = reader.nextInt();
            list[i] = input;

            //adds up the average as numbers are put in
            total += input;

        }
        
        average = total / list.length;
        System.out.println(total + "/ " + list.length + " " + average);
        System.out.println();

        int number = 0;
        //counts how many are higher, than makes the list
        for (int i = 0; i < list.length; i++) {
            if (list[i] > average) {
                higher++;
            }
        }

        float[] higherThanAverage = new float[higher];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > average) {
                higherThanAverage[higherPlace] = list[i];
                higherPlace++;
            }

        }
        for (int k = 0; k < higher; k++) {
            System.out.println("higherThanAvg[" + k + "] = " + higherThanAverage[k]);

        }
    }
    
    
}