public class Array2D_02
{
    public static void main(String[] args) {
        int k = 10;
        int[][] matrix;
        matrix = new int[7][7];
        for (int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = k;
                k++;
            }
        }
        System.out.println();
        
        for (int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
            
        System.out.println();
    }
}