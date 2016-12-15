public class ShortCircuit3
{
    public static void main(String[] args) {
        boolean liarLiar = false;
        if (liarLiar && 5/0 == 0) {
            System.out.println("The truth is, we never divided by zero.");
        } else {
            System.out.println("Liar, liar, pants on fire.");
        }
    }
}
