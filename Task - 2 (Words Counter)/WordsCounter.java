import java.util.Scanner;
public class WordsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");

        String inputString = sc.nextLine();

        // Removing leading and trailing whitespaces
        inputString = inputString.trim();

        // Splitting the string into words
        String[] words = inputString.split("\\s+");

        // Counting the number of words
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}