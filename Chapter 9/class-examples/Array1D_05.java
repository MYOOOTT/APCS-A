public class Array1D_05
{
   public static void main(String[] args) {
       int[] a = {2, 4, 6, 8, 10, 12, 14};
       int[] b = a; // b is an alias of a
       b[3] = 8675309;
       System.out.println("\nPrinting the values of a:");
       for (int i = 0; i < a.length; i++) {
           System.out.println(i + ":" + a[i]);
        }
       System.out.println("\nPrinting the values of b:");
       for (int j = 0; j < b.length; j++) {
           System.out.println(j + ":" + a[j]);
        }
    }
}
       