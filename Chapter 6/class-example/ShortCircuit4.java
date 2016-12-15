public class ShortCircuit4
{
    public static void main(String[] args) {
        boolean liarLiar = false;
        if (5/0 == 0 && liarLiar) {
            System.out.println("The truth is, we never divided by zero.");
        } else {
            System.out.println("Liar, liar, pants on fire.");
        }
    }
}
