import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example_2 extends JPanel 
{
    private Circle circle;
    
    public Example_2(Color backColor, int width, int height) {
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
        circle = new Circle(width / 2, height / 2, 25, Color.red);
        circle.setFilled(true);
        circle.setVelocity(50);
        addMouseListener(new MoveListener());
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle.draw(g);
    }
    
    private class MoveListener extends MouseAdapter{
        public void mousePressed(MouseEvent e) {
            circle.move();
            circle.turn(45);
            repaint();
        }
    }
}
    