public class SnakeEyes
{
    public static void main(String[] args) {
        final int ROLLS = 5000;
        int snakeEyes = 0;
        int num1;
        int num2;

        Die die1 = new Die();
        Die die2 = new Die(20);

        for (int count = 1; count <= ROLLS; count++) {
            num1 = die1.roll();
            num2 = die2.roll();

            if (num1 == 1 && num2 ==1) {
                snakeEyes++;
            }
        }
        
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + snakeEyes);
        System.out.println("Ratio: " + (double) snakeEyes / ROLLS);
    }
}