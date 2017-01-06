import java.util.*;

public class Project_1
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] list = new int[10];
        int[] evenList = new int[1], oddList,negativeList;
        System.out.println("Please input 10 integers: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("list[" + i + "] = ");
            int input = reader.nextInt();
            list[i] = input;
            if (input % 2 == 0) {
                count;
            }
        }

        int place = 0;
        int number;
        int count = 0;
        for (int e = 0; e < list.length; e++) {
            number = list[e];
            if (number % 2 == 0) {
                place = e;
                count++; //used to expand the list
                evenList = new int[1 + count]; 
                System.out.println(number);
                evenList[place] = number;
            }
            
        }
        
        for (int k = 0; k < 10; k++) {
            System.out.println("evenList[" + k + "] = " + evenList[k]);

        }

    }
}