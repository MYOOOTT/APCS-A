import java.util.*;

public class MagicSquare
{
    private final int SIZE = 4;
    private int[][] list = new int[SIZE][SIZE]; 
    private int constant = 0;

    public MagicSquare() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number here: (GOES ACROSS ROW) ");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int number = reader.nextInt();
                list[i][j] = number;
 
            }
        }
        //calculates the constant
        for (int i = 0; i < SIZE; i++) {
            constant += list[1][i];
        }
        System.out.println("Constant: " + constant);
    }

    public void printArray()  {
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(list[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private  boolean checkRow(int row) {
        int total = 0;
        for (int i = 0; i < SIZE; i++) {
            total += list[row][i];
        }
        return compareConstant(total);
    }

    private  boolean checkColumn(int column) {
        int total = 0;
        for (int i = 0; i < SIZE; i++) {
            total += list[i][column];
        }
        return compareConstant(total);
    }
    
    
    private  boolean checkDiagonal(int diagonal) {
        int j = 0, total = 0;
        //checks upward diagonal
        if (diagonal == 1) {
            for (int i = 0; i < SIZE; i++) {
                total += list[i][j];
                j++;
            }
            return compareConstant(total);
        //checks downward diagonal
        } else {
            j = SIZE - 1;
            for (int i = SIZE - 1; i > -1; i--) {
                total += list[i][j];
                j--;
            }
            return compareConstant(total);
        }
    }

    private boolean compareConstant(int total) {
        if (total == constant) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSquare() {
        int correctColumn = 0, correctRow = 0;
        boolean allRows = true, allColumns = true, 
                magicSquare = true;
        for (int i = 0; i < SIZE; i++) {
            //checks row/column, then if they are true then
            //add 1 to correctRow/Column to compare to SIZE
            if (checkColumn(i) == true) {
                correctColumn++;
            }
            if (checkRow(i) == true) {
                correctRow++;
            }
            
        }
        if (correctColumn != SIZE) {
            allColumns = false;
        }
        if (correctRow != SIZE) {
            allRows = false;
        }
        //if all of these are true, then it's a magicSquare!
        magicSquare = allColumns && allRows && checkDiagonal(1)
                      && checkDiagonal(2);
        return magicSquare;
                      
    }
}
