import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorPanel2 extends JPanel {

    int x, y;

    public ColorPanel2(Color backColor) {
        setBackground(backColor);

        x = 100;
        y = 100;

        addMouseListener(new PanelListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    private class PanelListener extends MouseAdapter{
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }
}