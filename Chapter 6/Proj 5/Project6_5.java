import java.util.*;

public class Project6_5
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int remainder = 1, bigNum, smallNum, num1 = 0, num2 = 0;

        System.out.print("Enter a positive number here: " );
        String bigger = reader.nextLine();
        System.out.print("Enter a positive number here: " );
        String smaller = reader.nextLine();
        

        try {
           num1 = Integer.parseInt(bigger);
           num2 = Integer.parseInt(smaller);
        } catch (Exception o) {
            System.out.println("Come on man. Just input an actual integer.");
        }
        if (num1 > num2) {
            bigNum = num1;
            smallNum = num2;
        } else {
            smallNum = num1;
            bigNum = num2;
        }
        System.out.printf("%-16s%-16s%-16s\n",
                          "Big Number", "Small Number", "Remainder\n");
        
        while (remainder != 0) {
            remainder = bigNum % smallNum;
            System.out.printf("%-16s%-16s%-16s\n",
                              bigNum, smallNum, remainder);
            bigNum = smallNum;
            smallNum = remainder;
        }
        
        System.out.println("The GCD is: " + bigNum);
    }
}
