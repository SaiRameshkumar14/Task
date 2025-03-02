// 2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short

public class TypeConversion {

    public static void main(String[] args) {
        float a = 10.0f;
        System.out.println("int -> " + (int) a);

        double b = 10; // or 0d
        System.out.println("float -> " + (float) b);

        int c = 10;
        System.out.println("short -> " + (short) c);
    }
}
