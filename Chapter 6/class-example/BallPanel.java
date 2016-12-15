import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallPanel extends JPanel {
    private Ball ball1, ball2;
    private javax.swing.Timer timer;
    private int numBalls = 100;

    public BallPanel() {
        setBackground(Color.black);
        setSize(1000,500);
        ball1 = new Ball(100, 100, 25, Color.blue);
        ball2 = new Ball(900, 100, 50, Color.red);

        timer = new javax.swing.Timer(5, new MoveListener());
        timer.start();
        addMouseListener( new MyMouseListener());

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball1.fill(g);
        ball2.fill(g);
    }

    private class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            if (ball1.getVelocity() != 0) {
                ball1.setVelocity(0);
                ball2.setVelocity(0);
            } else {
                ball1.setVelocity(7);
                ball2.setVelocity(7);
            }
        }

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
                ball1.setDirection(180 - ball1.getDirection());
            }
            if (y - radius <= 0 || y + radius >= height) {
                ball1.setDirection(360 - ball1.getDirection());
            }
            ball1.move();

            x = ball2.getX();
            y = ball2.getY();
            radius = ball2.getRadius();
            if (x - radius <= 0 || x + radius >= width) {
                ball2.setDirection(180 - ball2.getDirection());
            }
            if (y - radius <= 0 || y + radius >= height) {
                ball2.setDirection(360 - ball2.getDirection());
            }
            ball2.move();

            repaint();
        }
    }
}

   