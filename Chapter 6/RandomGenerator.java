public class RandomGenerator
{
    int random = 0;
    public RandomGenerator() {
        int d = (int) (Math.random() * 100);
        random = (int)(d + 1);
        System.out.println("I'm thinking of a number between 1 and 100...");
    }

    public int getValue() {
        return random;
    }

    public String compare(int guessedNum) {
        String response = "";
        if (guessedNum > random){
            response = "The number I'm thinking of is less.";
        } else if (guessedNum < random) {
            response = "The number I'm thinking of is more.";
        } else {
            response = "Correct!";
        }
        System.out.println();
        return response;
    }
}
