import java.util.*;
public class Project6_4 { 
    public static void main(String[] args) {
        Grader3000 grader = new Grader3000();
        Scanner reader = new Scanner(System.in);
        String letterGrade = "", response = "";
        int numericGrade = 0, a = 0, b = 0, c = 0, d = 0, f = 0, totalScore = 0,
            numberScore = 0;
        while (numericGrade != -2) {
            System.out.println("What is your numeric grade? (-1 to stop inputting): ");
            response = reader.nextLine();
            try {
                numericGrade = Integer.parseInt(response);
            } catch (Exception o) {
                System.out.println("Try again. Use a number this time.");
                System.out.println(response + " IS NOT AN INTEGER.");
                System.out.println();
            }

            if (numericGrade > 100) {
                System.out.println("Seriously? Put a number below 100.");
                numericGrade = 0;
                System.out.println("You really suck, though. I give you");
            }
            
            if (numericGrade == -1) {
                break;
            }
            totalScore = numericGrade + totalScore;
            numberScore++;
            letterGrade = grader.getLetterGrade(numericGrade);
            System.out.println("Grade: " + letterGrade + "\n");
            
            if (letterGrade.equals("A") || letterGrade.equals("A+") 
            || letterGrade.equals("A-")) {
                a++;
            }   
            if (letterGrade.equals("B") || letterGrade.equals("B+")
            || letterGrade.equals("B-")) {
                b++;
            }
            if (letterGrade.equals("C") || letterGrade.equals("C+")
            || letterGrade.equals("C-")){
                c++;
            }
            if (letterGrade.equals("D") || letterGrade.equals("D+")
            || letterGrade.equals("D-")) {
                d++;
            } else if (letterGrade.equals("F")) {
                f++;
            } 
            

        }
        System.out.println("A\t" + "B\t" + "C\t" + "D\t" + "F\t" );
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + f);

        String averageGrade = grader.getAverage(totalScore, numberScore);
        System.out.println("The average grade is: " + averageGrade);
        String minimumGrade = grader.getMinimum(a, b, c, d, f);
        System.out.println("The minimum grade is: " + minimumGrade);
        String maximumGrade = grader.getMaximum(a, b, c, d, f);
        System.out.println("The maximum grade is: " + maximumGrade);
    }
}