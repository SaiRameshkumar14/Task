package oneDataTypes;

// 4. Write a program to swap the two given numbers.
public class SwapNumber {

    public static void main(String[] args) {
        int a = 65;
        int b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
