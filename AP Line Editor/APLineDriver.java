/** You do not need to make any changes to this driver
 *  all code should be written inside the APLine class
 **/

public class APLineDriver
{
    public static void main(String[] args) {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        
        System.out.println("Line 1 has slope: " + slope1);
        System.out.println("Is point (5,-2) on line 1? " + onLine1);
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);
        
        System.out.println("Line 2 has slope: " + slope2);
        System.out.println("Is point (5,-2) on line 2? " + onLine2);
    }    
}
