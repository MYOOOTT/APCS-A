import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example_3 extends JPanel {
    private Circle circle;
    private javax.swing.Timer timer;
    
    public Example_3(Color backColor, int width, int height) {
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
        circle = new Circle(width / 2, height / 2, 25, Color.red);
        circle.setFilled(true);
        circle.setVelocity(50);
        timer = new javax.swing.Timer(125, new MoveListener());
        timer.start();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle.draw(g);
    }
    
    private class MoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            circle.move();
            circle.turn(45);
            repaint();
        }
    }
}