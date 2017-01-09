/*  Robot Student Version
 *  by Robert Hays
 *  9/27/2012
 */

public class Robot {
    public int[] hall;
    public int pos; // current position in the hall AND IS USUALLY PRIVATE
    private boolean facingRight; // true means is facing right

    // constructor is shown
    public Robot() {
        hall = new int[4];
        hall[0] = 0;
        hall[1] = 0;
        hall[2] = 0;
        hall[3] = 0;
        pos = 1;
        facingRight = true;
    } 

    // returns true if Robot has a wall in front of it 
    private boolean forwardMoveBlocked() {
        if (pos  >= hall.length  || pos <= 0) {
            return true;
        } else {
            return false;
        }
    } 

    // make one move and update the status of the Robot
    // also updates the status of the hall
    public void move() {
        int numItems = 0;  
        int moveAmt = 0;
        if (facingRight = true) {
            moveAmt = 1;
        } else {
            moveAmt = -1;
        }
        if (hall[pos] == 1 && forwardMoveBlocked() == false) {
            hall[pos] = numItems;
            hall[pos] = numItems - 1;
            pos += moveAmt;
        } else if (hall[pos] >= 1) {
            hall[pos] = numItems;
            hall[pos] = numItems - 1;
        } else if (hall[pos] == 0) {
            if (forwardMoveBlocked() == false) {
                pos += moveAmt;
            } else {
                facingRight = false;
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
            move();
            if (forwardMoveBlocked() == true) {
                
            }
        }
            return 0;
    } 

    // returns "true" if the hall contains no items
    // otherwise, this method will return "false"
    public boolean hallIsClear() {
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