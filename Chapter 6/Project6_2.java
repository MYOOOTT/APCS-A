import java.util.*;

public class Project6_2 {
    static int userNum = 0;
	private static void promptUser() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Think of a number from 1 - 100 (no decimals).");
		userNum = reader.nextInt();
	}
	
	public static void main(String[] args) {
		Guesser master = new Guesser();
		int guessedNum = 0;
		
		promptUser();
		while (userNum > 100) {
			System.out.print("Enter a number again. ");
			promptUser();
		}
		
		master.startTimer();
		while (guessedNum != userNum) {
			guessedNum = master.guess();
		}

		if (guessedNum == userNum) {
			master.stopTimer();
			System.out.println("It took me " + master.getTime() + " millisecond(s) to guess your number. " + "How easy!");
		}
	}
}
