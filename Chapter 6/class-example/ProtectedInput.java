import java.util.*;
public class ProtectedInput
{
    public static void main(String[] args) {
        String input = "";
        int num = 0;
        boolean goodInput = false;
        Scanner scan = new Scanner(System.in);
        while(!goodInput) {
            System.out.println("Enter an integer: " );
            input = scan.next();
            try {
                num = Integer.parseInt(input);
                goodInput = true;
            } catch (Exception o) {
                System.out.println("Exception: " + o);
                System.out.println(input + " is not an integer.");
                System.out.println();
            }
        }
        System.out.println("You entered: " + num);
    }
}
