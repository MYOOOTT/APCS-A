import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class Panel5_9 extends JPanel
{ 
    public Panel5_9(Color backColor){
        setBackground(backColor);
        addMouseListener(new PanelListener());
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    private class PanelListener extends MouseAdapter {
        public void mousePressed(MouseEvent e){
            Random generator = new Random();
            int rValue = generator.nextInt(256);
            int gValue = generator.nextInt(256);
            int bValue = generator.nextInt(256);
            Color randomColor = new Color(rValue, gValue, bValue);
            setBackground(randomColor);
        }
    }
}

