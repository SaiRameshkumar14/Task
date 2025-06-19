//2. Create a program that takes a student's score as input and outputs their corresponding grade.

import java.util.*;

public class StudentScoregrading {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Score : ");
        int studentScore = scan.nextInt();

        if (studentScore > 90 && studentScore <= 100) {
            System.out.println("Grade A+");
        } else if (studentScore > 80 && studentScore <= 90) {
            System.out.println("Grade A");
        } else if (studentScore > 70 && studentScore <= 80) {
            System.out.println("Grade B+");
        } else if (studentScore > 60 && studentScore <= 70) {
            System.out.println("Grade B");
        } else if (studentScore > 50 && studentScore <= 60) {
            System.out.println("Grade C+");
        } else if (studentScore <= 50) {
            System.out.println("Grade C");
        }
    }
}
