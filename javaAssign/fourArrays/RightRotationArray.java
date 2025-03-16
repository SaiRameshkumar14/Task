//1.Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user

import java.util.*;

public class RightRotationArray {

    // Function for right rotation
    static void rotateRight(int[] array, int rotationCount, int arrayLength) {
        for (int i = 0; i < rotationCount; i++) {
            int lastElement = array[arrayLength - 1];
            for (int j = arrayLength - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastElement;
        }
        System.out.println("Array after right rotation by " + rotationCount + " positions: " + Arrays.toString(array));
    }

    // Main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scan.nextInt();

        int[] userArray = new int[arraySize];

        // Take input elements from the user
        for (int index = 0; index < arraySize; index++) {
            System.out.print("Enter element at index " + index + " : ");
            userArray[index] = scan.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(userArray));

        System.out.print("Enter the number of positions to rotate: ");
        int rotationCount = scan.nextInt();

        rotateRight(userArray, rotationCount, userArray.length);
    }
}
