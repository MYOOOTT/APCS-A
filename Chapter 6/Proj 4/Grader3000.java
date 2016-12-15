import java.util.*;

public class Grader3000
{
    public static String getLetterGrade(int numericGrade) {
        String letterGrade = "";   
        if (numericGrade <= 59 && numericGrade != -1) {
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
        if (!letterGrade.equals("F")) {
            if (secondDigit == 1 || secondDigit == 0) {
                letterGrade += "-";
            } else if (numericGrade < 96 && (secondDigit >= 6 || secondDigit <= 9)) {
                letterGrade += "+";
            } else if (numericGrade > 96) {
                letterGrade += "+";
            }
        }

        return letterGrade;
    }
    
    public static String getAverage(int totalScore, int numberScore) {
        int average = (int) Math.round( (totalScore / numberScore) );
        return getLetterGrade(average);
    }

    public static String getMinimum(int a, int b, int c, int d, int f) {
        String minimum = "";
        if (f > 0) {
            minimum = "F";
        } else if (d > 0) {
            minimum = "D";
        } else if (c > 0) {
            minimum = "C";
        } else if (b > 0) {
            minimum = "B";
        } else if (a > 0) {
            minimum = "A";
        }
        return minimum;
    }
    
    public static String getMaximum(int a, int b, int c, int d, int f) {
        String maximum = "";
        if (a > 0) {
            maximum = "A";
        } else if (b > 0) {
            maximum = "B";
        } else if (c > 0) {
            maximum = "C";
        } else if (d > 0) {
            maximum = "D";
        } else if (f > 0) {
            maximum = "F";
        }
        return maximum;
    }
    
   
}