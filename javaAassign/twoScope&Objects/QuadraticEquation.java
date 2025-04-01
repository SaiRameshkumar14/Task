// 2. Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.

import java.util.*;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, and c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        scan.close();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + " , " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " ± " + imaginaryPart + "i");
        }
    }
}
