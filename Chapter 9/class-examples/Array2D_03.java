public class Array2D_03
{
   public static void main(String[] args) {
       int[][] matrix;
       matrix = new int[5][4];
       for(int r = 0; r < matrix.length; r++) {
           for (int c = 0; c < matrix[r].length; c++) {
               matrix[r][c] = (int) (Math.random() * 1000);
            }
        }
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] < 10) {
                    System.out.print("00" + matrix[r][c] + " ");
                } else if (matrix[r][c] < 100) {
                    System.out.print("0" + matrix[r][c] + " ");
                } else {
                    System.out.print(matrix[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}