public class ArraySort
{
   public static void main(String[] args) {
       int[] a = {5, 4, 3, 10, -2, 6};
       int[] s = new int[a.length];
       
       //copy values from a int s
       for (int i = 0; i < a.length; i++) {
           s[i] = a[i];
       }
        
       for (int i = 0; i < a.length; i++) {
           for (int j = i; j < s.length; j++) {
               //swap the items
               if (s[j] < s[i]) {
                   int temp = s[j];
                   s[j] = s[i];
                   s[i] = temp;
                }
            }
        }
        //print the sorted array
        System.out.println("Printing the sorted array");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}