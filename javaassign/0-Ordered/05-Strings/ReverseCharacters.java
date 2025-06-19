
import java.util.*;

public class ReverseCharacters {

    static String reverseString(String inputString) {
        String reversedString = "";
        int index = inputString.length() - 1;
        while (index >= 0) {
            reversedString += inputString.charAt(index);
            index--;
        }
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scan.nextLine();
        System.out.println("The reversed string of " + userInput + " is " + reverseString(userInput));
    }
}
