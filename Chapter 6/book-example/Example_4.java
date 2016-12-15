import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example_4 extends JPanel {
    private Circle circle;
    private javax.swing.Timer timer;
    
    public Example_4(Color backColor, int width, int height) {
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
        circle = new Circle(width / 2, height / 2, 25, Color.red);
        circle.setFilled(true);
        circle.setDirection(180);
        circle.setVelocity(5);
        timer = new javax.swing.Timer(125, new MoveListener());
        timer.start();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle.draw(g);
    }
    
    private class MoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int x = circle.getX();
            int radius = circle.getRadius();
            int width = getWidth();
            if (x - radius <= 0 || x + radius >= width) {
                circle.turn(180);
            }
            circle.move();
            repaint();
        }
    }
}