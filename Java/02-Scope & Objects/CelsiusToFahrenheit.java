// 1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions

import java.util.*;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // formula (0°C × 9/5) + 32 = 32°F
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf(celsius + " degree celsius is equal to " + fahrenheit + " Fahrenheit");
    }
}
