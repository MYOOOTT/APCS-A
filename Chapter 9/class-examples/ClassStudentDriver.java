import java.util.*;

public class ClassStudentDriver
{
    public static void main(String[] args) {
        ArrayList<ClassStudent> classroom = new ArrayList<ClassStudent>();

        ClassStudent s1 = new ClassStudent("Tobi", "Brown");
        ClassStudent s2 = new ClassStudent("Jomarc", "Brown");
        ClassStudent s3 = new ClassStudent("Mary", "Blue");
        ClassStudent s4 = new ClassStudent("Cheater", "Rainbow");
        ClassStudent s5 = new ClassStudent("Brick", "Brick Red");
        ClassStudent s6 = new ClassStudent("Nigen", "Black");

        classroom.add(s1);
        classroom.add(s2);
        classroom.add(s3);
        classroom.add(s4);
        classroom.add(s5);
        classroom.add(s6);
        
        
        

        for (int i = 0; i < classroom.size(); i++){
            if (classroom.get(i).getName().endsWith("n") == true) {
                System.out.println("This student's name ends with an 'n'");
                System.out.println(classroom.get(i));
                
            }
            
            if (classroom.get(i).getEyeColor().equals("Blue") || classroom.get(i).getName().startsWith("J")) {
                System.out.println("Removing a student that has blue eyes or " +
                                   "whose name starts with a J...");
                classroom.remove(classroom.get(i));
                i--;
            }
            
                
        }
        
        System.out.println("Printing the classroom...");
        for (ClassStudent student : classroom) {
            System.out.println(student);
        }
    }
}