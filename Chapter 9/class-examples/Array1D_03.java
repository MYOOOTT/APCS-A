public class Array1D_03
{
   public static void main(String[] args) {
       int list[] = new int[20];
       for (int k = 0; k < 20; k++) {
           list[k] = (int) (Math.random() * 900) + 100;
       }
       for (int k = 0; k < 20; k++) {
           System.out.println("list[" + k + "] = " + list[k]);
       }
   }
}
