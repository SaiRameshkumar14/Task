//1. Take three numbers from the user and print the greatest number.

import java.util.*;

public class SimpleLogicToPrintGreatestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = scan.nextInt();
        System.out.println("Enter Second Number:");
        int b = scan.nextInt();
        System.out.println("Enter Third Number:");
        int c = scan.nextInt();

        System.out.println("Greatest is : " + (a > b && a > c ? a : b > c ? b : c));
    }
}

class optimizedLogicToPrintGreatestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        System.out.print("Enter how many numbers you want to compare : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " number : ");
            int num = scan.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Greatest Number is " + max);
    }
}
