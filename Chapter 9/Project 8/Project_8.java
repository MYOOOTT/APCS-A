import java.util.*;

public class Project_8
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the size of the triangle you want:");

        int size = reader.nextInt();

        int[][] myArray = new int[size][size];
        myArray = calculatePascalTriangle(myArray); 
        printArray(myArray); //prints the array

    }

    private static int[][] calculatePascalTriangle(int[][] array)
    {
        array[0][1] = 1;

        for (int i = 1; i < array.length; i++)
        {
            for (int j = 1; j < array[i].length; j++)
            {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }

        return array;
    }

    private static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                if (array[i][j] != 0){
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

}