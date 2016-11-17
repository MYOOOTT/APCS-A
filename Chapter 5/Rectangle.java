import java.awt.*;
public class Rectangle
{
    private int midX, midY, width, height;
    private Color color;
    public Rectangle(int x, int y, int w, int h, Color c){
        midX = x;
        midY = y;
        width = w;
        height = h;
        color = c;
    }
    
    public void draw(Graphics g){
        Color newColor = g.getColor();
        g.setColor(color);
        // moves the center of the circle into the rectangle
        g.drawRect((midX - (width/2)), (midY - (height / 2)), 
                   (midX + (width/2)), (midY + (height / 2)));
        g.setColor(newColor);
    }
    
     public void fill(Graphics g){
        Color newColor = g.getColor();
        g.setColor(color);
        g.fillRect((midX - (width / 2)), (midY - (height / 2)), 
                  (midX + (width / 2)), (midY + (height / 2)));
        g.setColor(newColor);
    }
}
