//5. Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.

import java.util.*;

public enum WeekDay {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter week day number : ");
        int weekDayNumber = scan.nextInt();
        int takingModulo = weekDayNumber % 7 == 0 ? 7 : weekDayNumber % 7;
        System.out.println("Day on " + weekDayNumber + " is " + WeekDay.values()[takingModulo - 1]);
        scan.close();
    }
}
