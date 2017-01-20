public class Square
{
    int number;
    String status;
    boolean pennyLanded;
    public Square(int i) {
        status = Integer.toString(i);
        number = i;
    }
    
    public void landedPenny() {
        status = "P";
    }
    
    public boolean hasPenny() {
        return pennyLanded;
    }
    
    public int getValue() {
        return number;
    }
    
    public String toString() {
        return status;
    }
    
}
