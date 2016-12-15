import java.awt.*;

public class Ball {
    private int centerX, centerY, radius;
    private int velocity, direction;
    private Color color;
    
    public Ball (int x, int y, int r, Color c) {
        centerX = x;
        centerY = y;
        radius = r;
        color = c;
        velocity = 7;
        setRandomDirection(0,90);
    }
    
    public void fill(Graphics g) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.fillOval(centerX - radius, centerY - radius, radius * 2,
                   radius * 2);
        g.setColor(oldColor);
    }
    
    
    public void move(int xAmount, int yAmount) {
        centerX = centerX + xAmount;
        centerY = centerY + yAmount;
    }
    
    public int getX() {
        return centerX;
    }
    
    public int getY() {
        return centerY;
    }
    
    public int getRadius()  {
        return radius;
    }
    
    public int getVelocity() {
        return velocity;
    }
    
    public void setVelocity(int v) {
        velocity = v;
    }
    
    public int getDirection() {
        return direction;
    }
    
    public void setDirection(int degrees) {
        direction = degrees % 360;
    }
    
    public void setRandomDirection() {
        int d = (int) (Math.random() * 360);
        setDirection(d);
    }
    
    public void setRandomDirection(int min, int max) {
        int d = (int) (Math.random() * (max - min) + min);
        setDirection(d);
    }
    
    public void turn(int degrees) {
        direction = (direction + degrees) % 360;
    }
    
    public void move() {
        move( (int) (velocity * Math.cos(Math.toRadians(direction))),
              (int) (velocity * Math.sin(Math.toRadians(direction))));
    }
    
}
    
    