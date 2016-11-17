import java.util.Scanner;

public class PigLatinDriver
{
    public static void main(String[] args) {
        String sentence, result, another = "y";
        PigLatinTranslator translator = new PigLatinTranslator();
        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) {
            System.out.println();
            System.out.println("Enter a sentence (no punctuation):");
            sentence = scan.nextLine();

            System.out.println();
            result = translator.translate(sentence);
            System.out.println("That snetence in pigLatin is:");
            System.out.println(result);

            System.out.println();
            System.out.print("Translate another sentence (y/n): ");
            another = scan.nextLine();
        }
    }

}