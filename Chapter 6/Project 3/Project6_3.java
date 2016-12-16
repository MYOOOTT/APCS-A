
import java.util.*;

public class Project6_3
{
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        String letterGrade = "", response = "";
        int numericGrade = 0;
        while (numericGrade == 0) {
            System.out.println("What is your numeric grade?: ");
            response = reader.nextLine();
            try {
                numericGrade = Integer.parseInt(response);
            } catch (Exception o) {
                System.out.println("Try again. Use a number this time.");
                System.out.println(response + " IS NOT AN INTEGER.");
                System.out.println();
            }

            if (numericGrade > 100 || numericGrade < 0) {
                System.out.println("Seriously? Put a number between 0 and 100.");
                numericGrade = 0;
            }
        }
        if (numericGrade <= 59) {
            letterGrade = "F";
        } else if (numericGrade <= 69 && numericGrade >= 60) {
            letterGrade = "D";
        } else if (numericGrade <= 79 && numericGrade >= 70) {
            letterGrade = "C";
        } else if (numericGrade <= 89 && numericGrade >= 80) {
            letterGrade = "B";
        } else if (numericGrade >= 90) {
            letterGrade = "A";
        }

        int secondDigit = numericGrade % 10;
        if (secondDigit == 1 || secondDigit == 0) {
            letterGrade += "-";
        } else if (numericGrade < 96 && (secondDigit >= 6 || secondDigit <= 9)) {
            letterGrade += "+";
        } else if (numericGrade >= 96) {
            letterGrade += "+";
        }

        System.out.println("You got a: " + letterGrade);

    }
}