
import java.util.*;

public class VowelCounter {

    static int countVowels(String inputString) {
        String vowelCharacters = "aeiouAEIOU";
        int vowelCount = 0;
        for (int index = 0; index < inputString.length(); index++) {
            if (vowelCharacters.indexOf(inputString.charAt(index)) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scan.nextLine();
        System.out.println("The vowel count in '" + userInput + "' is " + countVowels(userInput));
    }
}
