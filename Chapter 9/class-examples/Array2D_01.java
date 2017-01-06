public class Array2D_01
{
    public static void main(String[] args) {
        int[][] matrix;
        final int SIZE = 3;
        matrix = new int[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}