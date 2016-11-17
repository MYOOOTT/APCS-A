import javax.swing.*;
import java.awt.*;

public class ClickCounter
{
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Click Anywhere In The Window");
        theGUI.setSize(800, 300);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClickCounterPanel myPanel = new ClickCounterPanel(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(myPanel);
        theGUI.setVisible(true);
    }
}