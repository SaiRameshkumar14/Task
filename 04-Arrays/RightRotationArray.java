//1.Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user

import java.util.*;

public class RightRotationArray {

    // function for right rotation
    static void rightRotate(int[] userArray, int rotateCount, int length) {
        for (int i = 0; i < rotateCount; i++) {
            int lastElement = userArray[length - 1];
            for (int j = length - 1; j > 0; j--) {
                userArray[j] = userArray[j - 1];
            }
            userArray[0] = lastElement;
        }
        System.out.println("Array after right rotation by " + rotateCount + " positions: " + Arrays.toString(userArray));
    }

    // Main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] userArray = new int[size];

        // take input elements from user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element of " + i + " : ");
            userArray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(userArray));

        System.out.print("Enter the number of positions to rotate: ");
        int rotate = scan.nextInt();

        rightRotate(userArray, rotate, userArray.length);
    }
}
