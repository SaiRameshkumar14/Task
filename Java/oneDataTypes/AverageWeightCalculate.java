package oneDataTypes;

// 6. Write a program that calculates the average weight of 10 people. 
//Use descriptive and meaningful variable names following Java naming conventions. 
//Use proper datatypes for the variables.
import java.util.*;

public class AverageWeightCalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWeight = 0.0;
        int numberOfPeople = 10;

        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("Enter weight of person " + i + ": ");
            double personWeight = scanner.nextDouble();
            totalWeight += personWeight;
        }

        double averageWeight = totalWeight / numberOfPeople;
        System.out.println("The average weight of " + numberOfPeople + " people is: " + averageWeight);
        scanner.close();
    }
}
