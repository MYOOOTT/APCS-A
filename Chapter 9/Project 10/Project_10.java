import java.util.*;

public class Project_10
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Board pennyBoard = new Board();
        System.out.println("PRESS ENTER TO PLAY");
        reader.nextLine();
        while (pennyBoard.getCoins() > 0) {
            System.out.print("PRESS ENTER TO FLIP COIN\r");
            reader.nextLine();
            pennyBoard.play();
        }
        System.out.println("You got " + pennyBoard.getScore() +
                           " points with 5 coins.");
                           
    }
    
}
