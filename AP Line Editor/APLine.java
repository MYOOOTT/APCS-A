public class APLine {
    private int a = 0; 
    private int b = 0; 
    private int c = 0;
    
    public APLine(int a, int b, int c){ 
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope() {
        return (double) (-a) / b;
    }
    
    public boolean isOnLine(int dX, int dY) {
        int checkValue;
        checkValue = ((a * dX) + (b * dY) + c);
        if (checkValue == 0) {
            return true;
        } else {
            return false;
        }
    }
}
