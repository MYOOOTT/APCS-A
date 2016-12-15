import javax.swing.*;
import java.awt.*;

public class BouncingBall
{
    public static void main(String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("Bouncing Ball");
        theGUI.setSize(1000, 500);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BallPanel panel = new BallPanel();
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
}