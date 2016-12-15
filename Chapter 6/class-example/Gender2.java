import java.util.*;

public class Gender2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Gender [M/F] ===>>  ");
        String gender = scan.next();

        while (!(gender.equals("M") || gender.equals("F)"))) { //supposed to be missing parentheses
            System.out.print("Enter your Gender [M/F] ===>>  ");
            gender = scan.next();

        }
        System.out.println("Your gender is " + gender);
    }
}