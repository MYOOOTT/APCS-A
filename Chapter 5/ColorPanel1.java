import javax.swing.*;
import java.awt.*;

public class ColorPanel1 extends JPanel{
    private Circle c1, c2;

    public ColorPanel1(Color backColor){
        setBackground(backColor);

        c1 = new Circle(200, 100, 25, Color.red);
        c2 = new Circle(100, 100, 50, Color.blue); 
    }

    public void paintComponent(Graphics g){
        super .paintComponent(g);
        c1.fill(g);
        c2.draw(g);
    }
}