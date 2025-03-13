
import java.util.*;

public class ReverseSentence {

    static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scan.nextLine();
        System.out.println("The reversed sentence is: ");
        System.out.println(reverseWords(inputSentence));
    }
}
