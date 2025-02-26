//1. Write a program to find second occurrence of a given number in an array

import java.util.*;

public class SecondOccurance {

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
        int target = scan.nextInt();
        int count = 0;
        for (int element : userInputArray) {
            if (element == target) {
                count++;
            }
        }

        if (count < 2) {
            System.out.println("The " + target + " is Not Present"); 
        }else {
            System.out.println("The " + target + " is Present");
        }
    }
}
