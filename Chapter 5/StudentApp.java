import java.util.Scanner;

public class StudentApp
{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Scanner reader = new Scanner(System.in);

        String name;
        int score;

        System.out.println("Enter the first student's name: ");
        name = reader.nextLine();
        student1.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's score: ");
            score = reader.nextInt();
            student1.setScore(i, score);
        }
        reader.nextLine();

        System.out.println("Enter the second student's name: ");
        name = reader.nextLine();
        student2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the student's score: ");
            score = reader.nextInt();
            student2.setScore(i, score);
        }

        System.out.println(student1);
        System.out.println(student2);

        if (student1.getHighScore() > student2.getHighScore()){
            name = student1.getName();
            score = student1.getHighScore();
        } else {
            name = student2.getName();
            score = student2.getHighScore();
        }
        System.out.println(name + " has the highest score: " + score);

        if (student1.getAverage() > student2.getAverage()){
            name = student1.getName();
            score = student1.getAverage();

        } else {
            name = student2.getName();
            score = student2.getAverage();
        }
        System.out.println(name + " has the highest average score: " + score);
    }
}