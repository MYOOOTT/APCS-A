import java.io.*;
import java.util.Scanner;

public class Example_1  {
	public static void main(String[] args) throws IOException {
	//setup scanner and array
	Scanner reader = new Scanner(System.in);
	int[] array = new int[10];
	int count = 0;
	
	//input numbers until full or user enters -1
	
	while (count < array.length) {
		System.out.print("Enter a number (-1 to quit): ");
		int number = reader.nextInt();
		if (number == -1) {
			break;
		}
			array[count] = number;
			count++;
	}
	
	//output the numbers to a text file
	PrintWriter writer = new PrintWriter(new File("numbers.txt"));
	for (int i = 0; i < count; i++) {
		writer.println(array[i]);
	}
	writer.close();
	}
}
