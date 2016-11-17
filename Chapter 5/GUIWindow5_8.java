import javax.swing.*;
import java.awt.*;

public class GUIWindow5_8{
    public static void main(String[] args){
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Rectangles");
        theGUI.setSize(600,600);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RectangleColorPanel panel = new RectangleColorPanel(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
}