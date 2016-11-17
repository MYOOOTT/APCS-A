import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleColorPanel extends JPanel {
    private Rectangle2 r1, r2;
    private Rectangle2 selectedRectangle;
    private int x, y;

    public RectangleColorPanel(Color backColor) {
        setBackground(backColor);
        r1 = new Rectangle2(100, 100, 100, 100, Color.red);
        r2 = new Rectangle2(200, 200, 200, 200, Color.blue);
        selectedRectangle = null;
        addMouseListener(new PanelListener());
        addMouseMotionListener(new PanelMotionListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        r1.fill(g);
        r2.draw(g);
    }

    private class PanelListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();

            if(r1.containsPoint(x, y)) {
                selectedRectangle = r1;
            }
            else if(r2.containsPoint(x, y)) {
                selectedRectangle = r2;
            }
        }

        public void mouseReleased(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            selectedRectangle = null;
        }
    }

    private class PanelMotionListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            int newX = e.getX();
            int newY = e.getY();
            int dx = newX - x;
            int dy = newY - y;

            if(selectedRectangle != null) {
                selectedRectangle.move(dx, dy);
            }

            x = newX;
            y = newY;
            repaint();
        }
    }
    }