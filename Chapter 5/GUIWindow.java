import javax.swing.*;
import java.awt.*;

public class GUIWindow
{
    public static void main (String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI Program");
        theGUI.setSize(1000, 800);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("smokey.jpg");
        ColorPanel panel = new ColorPanel(Color.white, image);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
}
}
