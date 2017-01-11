import java.util.Scanner;

public class TestScoresView {

		private TestScoresModel model;
		
		public TestScoresView(TestScoresModel m) {
			model = m;
			run();
		}
		
		//menu driven command loop
		private void run() {
			while (true) {
				System.out.println("Number of students: " + model.size());
				System.out.println("Index of current student: " +
											 model.currentPosition());
				displayMenu();
				int command = getCommand("Enter a number [1-11]: +"
															 + 1, 11);
				if (command == 11)
					break;
				runCommand(command);
			}
		}
		
		private void displayMenu() {
			//Exercise List the menu options
		}
		
		//LOOK AT BOOK TESTSCORESVIEW
		
		private int getCommand(String prompt, int low, int high) {
			//Exercise: recover from all input errors
			Scanner reader = new Scanner(System.in);
			System.out.println(prompt);
			return reader.nextInt();
		}
		
		//Selects a command to run based on a command number,
		// runs the command, and asks the user to continue by
		// pressing the Enter key	
		private void runCommand(int command) {
			//exercise
			
		}
}
