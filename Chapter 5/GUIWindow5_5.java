import javax.swing.*;
import java.awt.*;
public class GUIWindow5_5
{
    public static void main(String[] args){
        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI Program");
        theGUI.setSize(1000,1000);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Project5_5Panel panel = new Project5_5Panel(Color.white);
        Container pane = theGUI.getContentPane();
        pane.add(panel);
        theGUI.setVisible(true);
    }
}