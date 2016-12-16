import java.util.Scanner;
import java.util.Random;

public class Project6_6
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();

        int die1 = 0, die2 = 0, dollars, count, resetDollar;
        int averageNum = 0, average;
        int x = 0;
        System.out.print("How many dollars do you have? ");
        dollars = reader.nextInt();
        resetDollar = dollars;
        for (int i = 1; i <= 100; i++) {
            count = 0;
            dollars = resetDollar;
            while (dollars > 0){
                count++;

                die1 = generator.nextInt(6) + 1;
                die2 = generator.nextInt(6) + 1;

                if (die1 + die2 == 7)
                    dollars += 4;
                else 
                    dollars -= 1;

            }
            System.out.println("You are broke after " + count + " rolls. \n");
            averageNum += count;
            
        }
        average = averageNum / 100;
        System.out.println("It takes someone on average with $" + resetDollar + " to become broke " +
            "after " + average + " rolls.");
    }
}
