import java.awt.*;

public class Circle
{
    private int centerX, centerY, radius, direction, velocity;
    private Color color;
    boolean filled;

    public Circle(int x, int y, int r, Color c) {
        centerX = x;
        centerY = y;
        radius = r;
        color = c;
        velocity = 0;
        direction = 0;
        filled = false;
    }

    public void draw(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.drawOval(centerX - radius, centerY - radius,
            radius * 2, radius * 2);
        g.setColor(oldColor);
    }

    public void fill(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.fillOval(centerX - radius, centerY - radius,
            radius * 2, radius * 2);
        g.setColor(oldColor);
    }

    public boolean containsPoint(int x, int y) {
        int xSquared = (x - centerX) * (x - centerX);
        int ySquared = (y - centerY) * (y - centerY);
        int radiusSquared = radius * radius;
        return xSquared + ySquared - radiusSquared <= 0;
    }

    public void move(int xAmount, int yAmount) {
        centerX += xAmount;
        centerY += yAmount;
    }

    public void setVelocity(int v) {
        velocity = v;
    }

    public void setDirection (int degrees) {
        direction = degrees % 360;
    }

    public void turn (int degrees) {
        direction = (direction + degrees) % 360;
    }

    public void move() {
        move((int) (velocity * Math.cos(Math.toRadians(direction))),
            (int) (velocity * Math.sin(Math.toRadians(direction))));
    }
    
    public void setFilled(boolean e) {
        e = filled;
    }
    
    public int getX() {
        return centerX;
    }
    
    public int getRadius() {
        return radius;
    }
    
 }