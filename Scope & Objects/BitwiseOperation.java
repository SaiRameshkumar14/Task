// 3. Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.

import java.util.*;

public class BitwiseOperation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numberOne = scan.nextInt();
        System.out.print("Enter second number: ");
        int numberTwo = scan.nextInt();

        System.out.println("Bitwise AND: " + (numberOne & numberTwo));
        System.out.println("Bitwise OR: " + (numberOne | numberTwo));
        System.out.println("Bitwise XOR: " + (numberOne ^ numberTwo));
        System.out.println("Left Shift: " + (numberOne << 1));
        System.out.println("Right Shift: " + (numberOne >> 1));
    }
}
