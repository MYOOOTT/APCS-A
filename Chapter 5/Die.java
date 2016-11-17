public class Die
{
    private int numFaces; //number of faces on the die
    private int faceValue; // current value showing on the die
    
    public Die() {
        numFaces = 6;
        faceValue = 1;
    }
    
    public Die(int faces) {
        numFaces = faces;
        faceValue = 1;
    }
    
    //rolsl the die and returns the result
    public int roll() {
        faceValue = (int) (Math.random() * numFaces) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
     
}