import java.util.*;

public class Array1D_04 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i+1) + ": ");
            a[i] = reader.nextInt();
        }
        System.out.println("The 10 numbers you entered were: ");
        for (int j = 0; j < 10; j++) {
            System.out.println(j + ": " + a[j]);
        }
    }
}