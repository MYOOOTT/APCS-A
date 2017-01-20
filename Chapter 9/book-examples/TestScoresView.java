import java.util.Scanner;

public class TestScoresView {

    private TestScoresModel model;
    private boolean runLoop = true;
    
    public TestScoresView(TestScoresModel m) {
        model = m;
        run();
    }

    //menu driven command loop
    private void run() {
        while (runLoop == true) {
            System.out.println("Number of students: " + model.size());
            System.out.println("Index of current student: " +
                model.currentPosition());
            displayMenu();
            int command = getCommand("Enter a number [1-11]: ", 
                    1, 11);
                    System.out.println("Command: " + command);
            if (command == 11)
                break;
            runCommand(command);
        }
    }

    private void displayMenu() {

        String s1 = "\r(1) Add student";
        String s2 = "\r(2) Replace student";
        String s3 = "\r(3) Move to first student";
        String s4 = "\r(4) Move to next index";
        String s5 = "\r(5) Move to previous student";
        String s6 = "\r(6) Move to last student";
        String s7 = "\r(7) Check size of classroom";
        String s8 = "\r(8) Get test average of class";
        String s9 = "\r(9) Get student with highest score";
        String s10 = "\r(10) Examine student";
        String s11 = "\r(11) Exit menu";

        String[] menu = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11};
        for (String s: menu) 
            System.out.println(s);

    }
    //prompts the user for a command number and runs until the user
    //enters a valid command number
    //parameters: prompt is the string to display
    //low is smallest command number
    //hgih is the alrgest command number
    //returns: a valid command number (>= low && <= high)
    private int getCommand(String prompt, int low, int high) {
        //Exercise: recover from all input errors
        Scanner reader = new Scanner(System.in);
        System.out.println(prompt);
        int commandNumber = low - 1;
        while (!reader.hasNextInt()) {
            System.out.println("You didn't even put an integer!");
            System.out.println(prompt);
            reader.next();
        }
        commandNumber = reader.nextInt();
        
        while (commandNumber > high || commandNumber < low ) {
                    System.out.println("Please put in an integer inbetween " 
                                       + low + " and " + high + "\n");
                    System.out.println(prompt);
                    commandNumber = reader.nextInt();
        }
        if (commandNumber == 11) {
            runLoop = false;
        }
        return commandNumber;
    }


    //Selects a command to run based on a command number,
    // runs the command, and asks the user to continue by
    // pressing the Enter key   
    private void runCommand(int command) {
        Scanner reader = new Scanner(System.in);
        if (command == 1) { //adding a student
            System.out.println("What is the name of the student?");
            String name = reader.nextLine();
            System.out.println("Enter 3 test scores:");
            int tests[] = new int[3];
            for (int i = 0; i < tests.length; i++) {
                tests[i] = reader.nextInt();
            }
            
            Student s = new Student(name, tests);
            model.add(s);
            System.out.println("Successfully added a student.");
        }
        
        if (command == 2) { // replace a student
            System.out.println("What is the name of the student?");
            String name = reader.nextLine();
            System.out.println("Enter 3 test scores:");
            int tests[] = new int[3];
            
            for (int i = 0; i < tests.length; i++) {
                tests[i] = reader.nextInt();
            }
            
            Student s = new Student(name, tests);
            model.replace(s);
            System.out.println("Successfully replaced a student.");
        }
        
        if (command == 3) { // examine first student
            model.first();
        }
        
        if (command == 4) { // examine next student
            model.next();
        }
        
        if (command == 5) { // examine previous student
            model.previous();
        }
        
        if (command == 6) { // examine last student
            model.last();
        }
        
        if (command == 7) { // examine classroom size
            System.out.println("Class size: " + model.size());
        }
        
        if (command == 8) { // get Class average
            System.out.println("The class average is " +
                                model.getClassAverage() + " percent.");
        }
        
        if (command == 9) {// get student with highest score
            System.out.println(model.getHighScore());
        }
        
        if (command == 10) { //examine student
            System.out.println(model.currentStudent());
        }
        System.out.println("Press ENTER to continue.");
        reader.nextLine();
        run();
    }
    
}
