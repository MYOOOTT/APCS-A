import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project6_9 extends JPanel {

    private Ball ball1, ball2;
    private javax.swing.Timer timer;
    int count = 1;

    public Project6_9(Color backColor, int width, int height) {
        setBackground(backColor);
        setPreferredSize(new Dimension(width, height));
        
        timer = new javax.swing.Timer(5, new MoveListener());
        timer.start();
       
        ball1 = new Ball(100, 100, 25, Color.red);
        ball2 = new Ball(800, 100, 25, Color.red);
        ball1.setVelocity(1);
        ball2.setVelocity(1);
        ball1.setDirection(180);
        ball2.setDirection(360);

        timer = new javax.swing.Timer(5, new MoveListener());
        timer.start();
        addMouseListener(new PanelListener());

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball1.fill(g);
        ball2.fill(g);
    }

    private class MoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int width = getWidth();
            int height = getHeight();
            int x = 0;
            int y = 0;
            int radius = 0;

            x = ball1.getX();
            y = ball1.getY();
            radius = ball1.getRadius();
            if (x - radius <= 0 || x + radius >= width) {
                ball1.turn(180);
            }
            ball1.move();

            x = ball2.getX();
            y = ball2.getY();
            radius = ball2.getRadius();
            if (x - radius <= 0 || x + radius >= width) {
                ball2.turn(180);
            }
            ball2.move();

            repaint();
        }
        
    }

    private class PanelListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            count++;
            if (count  % 2 == 0) {
                timer.start();
            } else {
                timer.stop();
            }
        }
    }
}