import java.util.*;

public class ATM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "0000";
        int tries = 1;
        while (!pin.equals("5423") && (tries <= 3)) {
            System.out.print("Enter your PIN ===>>  ");
            pin = input.nextLine();
            tries++;
        }
        if (pin.equals("5423")) {
            System.out.println("Your PIN is accepted.");
        } else {
            System.out.println("You have exceeded your PIN entries.");
        }
    }
}
