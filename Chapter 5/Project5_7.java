import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Project5_7
{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        int amtPic = 0;

        System.out.print("Enter number of pictures: ");
        amtPic = scanner.nextInt();
        scanner.nextLine();

        if (amtPic == 4) {
            JFrame theGUI = new JFrame();

            theGUI.setTitle("Pictures");
            theGUI.setSize(800, 800);
            theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            System.out.println("What is the name of your picture?" +
                               "(include the file extension)");
                               
            String i1 = scanner.nextLine();
            String i2 = scanner.nextLine();
            String i3 = scanner.nextLine();
            String i4 = scanner.nextLine();

            
            ImageIcon image1 = new ImageIcon(i1);
            ImageIcon image2 = new ImageIcon(i2);
            ImageIcon image3 = new ImageIcon(i3);
            ImageIcon image4 = new ImageIcon(i4);

            GUIWindow5_7 panel1 = new GUIWindow5_7(Color.green, image1);
            GUIWindow5_7 panel2 = new GUIWindow5_7(Color.black, image2);
            GUIWindow5_7 panel3 = new GUIWindow5_7(Color.gray, image3); 
            GUIWindow5_7 panel4 = new GUIWindow5_7(Color.white, image4);

            Container pane = theGUI.getContentPane();
            pane.setLayout(new GridLayout(2, 2));
            pane.add(panel1);
            pane.add(panel2);
            pane.add(panel3);
            pane.add(panel4);

            theGUI.setVisible(true);
        } else if (amtPic == 2){

            JFrame theGUI = new JFrame();

            theGUI.setTitle("Picture");
            theGUI.setSize(800, 800);
            theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            System.out.println("What is the name of your picture?" +
                               "(include the file extension)");
                               
            String i1 = scanner.nextLine();
            String i2 = scanner.nextLine();
            
            ImageIcon image1 = new ImageIcon(i1);
            ImageIcon image2 = new ImageIcon(i2);

            GUIWindow5_7 panel1 = new GUIWindow5_7(Color.gray, image1);
            GUIWindow5_7 panel2 = new GUIWindow5_7(Color.black, image2);

            Container pane = theGUI.getContentPane();

            pane.setLayout(new GridLayout(2, 2));
            pane.add(panel1);
            pane.add(panel2);
            theGUI.setVisible(true);
        } else if (amtPic == 1){

            JFrame theGUI = new JFrame();
            theGUI.setTitle("Picture");
            theGUI.setSize(800, 800);
            theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            System.out.println("What is the name of your picture?" +
                               "(include the file extension)");
                               
            String i1 = scanner.nextLine(); 
            
            ImageIcon image1 = new ImageIcon(i1);

            GUIWindow5_7 panel1 = new GUIWindow5_7(Color.white, image1);

            Container pane = theGUI.getContentPane();

            pane.setLayout(new GridLayout(1, 1));
            pane.add(panel1);
            theGUI.setVisible(true);
        }else {
            System.out.println("Error: Please enter either 1, 2, or 4 pictures");
        }
    }
}
