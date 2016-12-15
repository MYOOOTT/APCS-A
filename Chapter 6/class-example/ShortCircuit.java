public class ShortCircuit
{
    public static void main(String[] args) {
        boolean theTruth = true;
        if (theTruth || 5/0 == 0)
            System.out.println("The truth is, we never divided by zero.");
    }
}
