import javax.swing.*;
import java.awt.*;
public class Project5_5Panel extends JPanel{
    private Circle c1, c2;
    private Rectangle r1, r2;
    public Project5_5Panel(Color backColor){
        setBackground(backColor);
        c1 = new Circle(512, 400, 50, Color.black);
        c2 = new Circle(900, 400, 50, Color.black);
        r1 = new Rectangle(492, 180, 100, 0, Color.red);
        r2 = new Rectangle(447, 120, 10, 100, Color.red);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        c1.fill(g);
        c2.fill(g);
        r1.fill(g);
        r2.fill(g);
    }
}