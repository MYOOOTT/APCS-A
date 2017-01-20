import java.util.*;

public class Board
{
    Square[][] board = new Square[5][5];
    int score;
    int coins = 5;
    public Board() {
        resetBoard();
        printBoard();
    }

    public void resetBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (row == 2 & column == 2) {
                    board[row][column] = new Square(3);
                } else if ( (row > 0 && row < 4) &&
                (column > 0 && column < 4)) {
                    board[row][column] = new Square(2);
                } else {
                    board[row][column] = new Square(1);
                }
            }
        }
        
        coins = 5;
        score = 0;
    }

    public void printBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {

                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void play() {
            Random rand = new Random();
            int rand1 = rand.nextInt(5);
            int rand2 = rand.nextInt(5);
            if (board[rand1][rand2].hasPenny() == true) {
                System.out.println("The penny landed on a square that has a penny.");
                System.out.println("Trying again...\n");
                rand1 = rand.nextInt(5);
                rand2 = rand.nextInt(5);
            }
            board[rand1][rand2].landedPenny();
            score += board[rand1][rand2].getValue();
            coins--;
            System.out.println("Score: " + score);
            System.out.println("Coins left: " + coins);
            printBoard();
    }
    
    public int getScore() {
        return score;
    }
    
    public int getCoins() {
        return coins;
    }
        

    }


