import java.util.Scanner;
import java.util.Random;

public class Project6_6
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generator = new Random();

        int die, total = 0;

        for (int i = 0; i <= 100; i++){
            die = generator.nextInt(6) + 1;
            total += die;
        }
        System.out.println(total);
        int average =  (int) Math.round( (total / 100.0) );
        System.out.println("The average number for rolls is: " + average);
        
        
    }
}