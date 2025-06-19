
import java.util.*;

public class CapitalizeFirstLetter {

    static String capitalizeWords(String inputSentence) {
        String capitalizedSentence = "";
        String[] wordsArray = inputSentence.split(" ");
        for (String word : wordsArray) {
            capitalizedSentence += (Character.toUpperCase(word.charAt(0)) + word.substring(1, word.length())) + " ";
        }
        return capitalizedSentence;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scan.nextLine();
        System.out.println("The capitalized sentence of " + userInput + " is ");
        System.out.println(capitalizeWords(userInput));
    }
}
