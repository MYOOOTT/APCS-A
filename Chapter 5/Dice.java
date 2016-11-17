public class Dice {
    private int side;
    public Dice() {
        side = 1;
    }

    public void roll() {
        double d = Math.random() * 6;
        side = (int)(d + 1);

    }

    public int getValue() {
        return side;
    }
}