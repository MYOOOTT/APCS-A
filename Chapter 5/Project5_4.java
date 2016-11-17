import java.util.Scanner;

public class Project5_4
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dice roller = new Dice();

        int die1, die2, dollars, count, maxDollars, countAtMax;

        System.out.print("How many dollars do you have? ");
        dollars = reader.nextInt();

        maxDollars = dollars;
        countAtMax = 0;
        count = 0;

        while (dollars > 0){
            count++;

            roller.roll();
            die1 = roller.getValue();
            roller.roll();
            die2 = roller.getValue();

            if (die1 + die2 == 7)
                dollars += 4;
            else 
                dollars -= 1;

            if (dollars > maxDollars) {
                maxDollars = dollars;
                countAtMax = count;
            }
        }
        System.out.println("You are broke after " + count + " rolls. \n" +
            "You should have quit after " + countAtMax +
            " rolls when you had $" + maxDollars + ".");
    }
}