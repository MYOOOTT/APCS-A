/*  Robot Student Version
 *  by Robert Hays
 *  9/27/2012
 */

public class Robot {
    private int[] hall;
    private int pos; // current position in the hall AND IS USUALLY PRIVATE
    private boolean facingRight; // true means is facing right

    // constructor is shown
    public Robot() {
        hall = new int[4];
        hall[0] = 1;
        hall[1] = 1;
        hall[2] = 2;
        hall[3] = 2;
        pos = 1;
        facingRight = true;
    } 

    // returns true if Robot has a wall in front of it 
    private boolean forwardMoveBlocked() {
        if (pos == hall.length - 1 && facingRight == true) {
            return true;
        } 
        if (pos == 0 && facingRight == false) {
            return true;
        } else {
            return false;

        }
    }

    // make one move and update the status of the Robot
    // also updates the status of the hall
    private void move() {
        int numItems = 0;
        int moveAmt = 0;
        
        // picks up an item if there is more an item on the floor
        if (hall[pos] >= 1) {
            numItems = hall[pos];
            hall[pos] = numItems - 1;
            System.out.println("Picked up an item.");
        } 
        //checks if there are no items first, then if it can move forward or not. If it hits a wall, it turns around.
        if (hall[pos] == 0) {
            if (forwardMoveBlocked() == false && facingRight == true) {
                pos += 1;
                System.out.println("Moved forward.");
            } else if (forwardMoveBlocked() == false && facingRight == false) {
                pos -= 1;
                System.out.println("Moved backwards.");
            } else {
                facingRight = !facingRight;
                System.out.println("Turned around.");
            }

        }

    }  

    // while the hall is not clear
    // the robot will move (i.e. do its job)
    // once the hall is clear
    // this method will return the number of moves made
    public int clearHall() {
        int moves = 0;
        while (hallIsClear() != true) {
            moves++;
            System.out.println();
            System.out.println("Move " + moves);
            System.out.println("------");
            move();
        }
        return moves;
    } 

    // returns "true" if the hall contains no items
    // otherwise, this method will return "false"
    private boolean hallIsClear() {
        /* to be implemented in part (c) */
        // false = there are items still there
        int tileClear = 0;
        boolean hallClear = false;
        for (int i = 0; i < hall.length; i++) {
            if (hall[i] == 0 ) {
                tileClear++;
            }
        }
        if (tileClear == hall.length) {
            hallClear = true;
        }
        return hallClear;
    }
}