//3. Write a program to find the sum of even numbers only in a given array. Use continue.

import java.util.*;

public class PrintEvenNumberInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sizeOfArray = scan.nextInt();
        int[] userInputArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            userInputArray[i] = scan.nextInt();
        }

        System.out.print("Enter the Target Element to find second occurance : ");
        int total = 0;

        for (int i = 0; i < userInputArray.length; i++) {
            if (userInputArray[i] % 2 == 0) {
                total += userInputArray[i];
            }
        }
        System.out.println("Sum of even numbers: " + total);
    }
}
