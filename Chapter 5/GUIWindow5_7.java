import javax.swing.*;
import java.awt.*;

public class GUIWindow5_7 extends JPanel
{
    private ImageIcon image;

    public GUIWindow5_7 (Color backColor, ImageIcon i){
        setBackground(backColor);
        image = i;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = (getWidth() - image.getIconWidth()) / 2;
        int y = (getHeight() - image.getIconHeight()) / 2;
        image.paintIcon(this, g, x, y);
    }
}
