import java.util.*;

public class Project6_1
{
    public static void main(String[] args) {
        RandomGenerator number = new RandomGenerator();
        Scanner reader = new Scanner(System.in);
        int guessedNum = 0;
        String result = "";
        int count = 0;
        boolean exit = false;

        while (result.equals("Correct!") == false) {
            System.out.println("Enter your guess here (# to exit):");
            String input = reader.nextLine();
            if (input.equals("#")) { // # exits the loop
                exit = true;
                break;
            } else {
                guessedNum = Integer.parseInt(input);
            }
            result = number.compare(guessedNum);
            System.out.println(result);
            count++;

        }

        if (exit == false) {
            System.out.print("It took you " + count + " tries " +
                "to guess the number.");

            if (count == 1) {
                System.out.print(" Wow! You're amazing!");
            } else if (count <= 10 && count != 1) {
                System.out.print(" You're a really good guesser.");
            } else if (count > 10 && count < 50) {
                System.out.print(" You're an okay guesser.");
            } else
                System.out.print(" You're not that good at" +
                    " guessing.");
        } else if (exit == true && count == 0) {
            System.out.println("You didn't even try!");
        } else {

            System.out.println("Wow. What a quitter!");
        }
    }
}
