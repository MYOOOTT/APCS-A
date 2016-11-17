import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounterPanel extends JPanel {
    int clickCounter;

    public ClickCounterPanel(Color backColor){
        setBackground(backColor);
        addMouseListener(new PanelListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Font myFont = new Font("Times New Roman", Font.BOLD, 72);
        g.setFont(myFont);
        g.drawString("Clicked " + clickCounter + " times.", 50, 50);

    }
    private class PanelListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            clickCounter = clickCounter + 1;
            repaint();
        }
    }
}
