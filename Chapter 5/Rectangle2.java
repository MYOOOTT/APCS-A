import java.awt.*;

public class Rectangle2{
    private int midX, midY, width, height;
    private Color color;

    public Rectangle2(int x, int y, int w, int h, Color c){
        midX = x;
        midY = y;
        width = w;
        height = h;
        color = c;
    }

    public void draw(Graphics g){
        Color oldColor = g.getColor();
        g.setColor(color);
        g.drawRect(midX, midY, width, height);
        g.setColor(oldColor);
    }

     public void fill(Graphics g){
        Color oldColor = g.getColor();
        g.setColor(color);
        g.fillRect(midX, midY, width, height);
        g.setColor(oldColor);
    }

     public boolean containsPoint(int x, int y) {
        int x2 = (x - midX) * (x - midX);
        int y2 = (y - midY) * (y - midY);
        int area = width * height;
        return x2 + y2 - area <= 0;
    }

    public void move(int xAmount, int yAmount) {
        midX = midX + xAmount;
        midY = midY + yAmount;
    }
}