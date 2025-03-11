import java.util.Scanner;

public class WordCounter {

    public static String getSentenceInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return sc.nextLine();
    }

    public static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("The sentence contains " + wordCount + " words.");
    }
}
