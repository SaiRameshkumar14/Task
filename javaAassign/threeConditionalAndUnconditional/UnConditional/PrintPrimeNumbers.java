//2. Write a program to print prime numbers between 1 to 30

public class PrintPrimeNumbers {

    static boolean checkThisIsPrimeOrNot(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        while (i <= 30) {
            if (checkThisIsPrimeOrNot(i)) {
                System.out.println(i + " is Prime Number");
            }
            i++;
        }
    }
}
