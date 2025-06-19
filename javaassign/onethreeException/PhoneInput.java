
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your phone number: ");
            long phone = sc.nextLong();
            System.out.println("Phone number: " + phone);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter only numbers.");
        }
    }
}
