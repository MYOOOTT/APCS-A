public class MultTable2
{
    public static void main(String[] args) {
        int k = 1;
        int table = 11;
        while (table <= 13) {
            while(k <= 5) {
                System.out.println(k + " * " + table + " = " + k * table);
                k++;
            }
            System.out.println();
            k = 1;
            table++;
        }
    }
}
