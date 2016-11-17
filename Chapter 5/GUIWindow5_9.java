import java.awt.*;
import javax.swing.*;
public class GUIWindow5_9
{
    public static void main (String[] args){
        JFrame theGUI = new JFrame();

        theGUI.setTitle("Click a square!");
        theGUI.setSize(600, 600);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = theGUI.getContentPane();
        pane.setLayout(new GridLayout(0, 8));

        for (int row = 1; row <= 8; row++){
            for (int col = 1; col <= 8; col++){
                Panel5_9 panel = new Panel5_9(Color.white);
                pane.add(panel);
            }
        }
        
        theGUI.setVisible(true);
    }
}