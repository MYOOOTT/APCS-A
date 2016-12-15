import java.util.*;

public class Project6_2 {
    static int userNum = 0;

    private static void promptUser() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Think of a number from 1 - 100 (no decimals).");
        userNum = reader.nextInt();
    }

    public static void main(String[] args) {
        Guesser master = new Guesser();
        int guessedNum = 0; 
        int low = 1, high = 100;

        promptUser();
        while (userNum > 100 || userNum < 1) {
            System.out.print("Enter a number again. (Must be inbetween 0 - 100)");
            promptUser();
        }

        master.startTimer();
        guessedNum = 50;
        while (guessedNum != userNum) {
            System.out.println("The computer guesses: " + guessedNum);
            if (guessedNum > userNum) {
                high = guessedNum;
            } else if (guessedNum < userNum) {
                low = guessedNum + 1;
            }
            guessedNum = (int)(low + high) / 2;
        }

        if (guessedNum == userNum) {
            master.stopTimer();
            if (master.getTime() <= 0) {
                System.out.println("It took me less than a millisecond to guess " +
                    "your number! How easy!");
            } else {
                System.out.println("It took me " + master.getTime() + 
                    " millisecond(s) to guess your number. That's slow.");
            }
        }
    }
}