import java.util.*;

public class Gender3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Gender (M/F) ===>>  ");
        String gender = scan.next();

        while (!(gender.equals("M") && !(gender.equals("F")))) {
            System.out.print("Enter your Gender [M/F] ===>>  ");
            gender = scan.next();

        }
        System.out.println("Your gender is " + gender);
    }
}