import java.util.*;

public class Project_7
{
   
    public static void main(String[] args) {
        MagicSquare square = new MagicSquare();
        square.printArray();
        if (square.checkSquare() == true) {
            System.out.println("You got a magic square!");
        } else {
            System.out.println("That's not a magic square.");
        }
        
    }
    
}

