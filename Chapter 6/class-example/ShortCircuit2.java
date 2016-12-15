public class ShortCircuit2
{
    public static void main(String[] args) {
        boolean theTruth = true;
        if (5/0 == 0 || theTruth)
            System.out.println("The truth is, we never divided by zero.");
    }
}
