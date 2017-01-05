import java.io.*;
import java.util.Scanner;

public class Example_2 {
	
	public static void main(String[] args) throws IOException {
		//setup scanner and array
		Scanner reader = new Scanner(new File("numbers.txt"));
		int[] array = new int[10];
		int count = 0;
		
		//Input numbers until full or end of file is reached
		while (count < array.length && reader.hasNext()) {
			int number = reader.nextInt();
			array[count] = number;
			count++;
		}
		
		//output the numbers to the terminal window
		for (int i = 0; i < count; i++)
			System.out.println(array[i]);
			
		//display error message if not all data are read from file
			if (reader.hasNext()) {
				System.out.println("Some data lost during input");
			}
	}
}
