
import java.util.Scanner;

public class JaggedArrayWeights {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numberOfPeople = scan.nextInt();
        int[][] weightRecords = new int[numberOfPeople][];

        for (int personIndex = 0; personIndex < numberOfPeople; personIndex++) {
            System.out.print("Enter the number of weight entries for person " + (personIndex + 1) + ": ");
            int weightCount = scan.nextInt();
            weightRecords[personIndex] = new int[weightCount];
            System.out.println("Enter weights for person " + (personIndex + 1) + ":");
            for (int weightIndex = 0; weightIndex < weightCount; weightIndex++) {
                weightRecords[personIndex][weightIndex] = scan.nextInt();
            }
        }

        addWeightEntry(weightRecords, scan);
        findMinimumWeight(weightRecords, scan);
    }

    // (a) Function to enter a new weight for any person
    static void addWeightEntry(int[][] weightRecords, Scanner scan) {
        System.out.print("Enter the person number to add weight: ");
        int personNumber = scan.nextInt() - 1;
        if (personNumber < 0 || personNumber >= weightRecords.length) {
            return;
        }

        System.out.print("Enter the new weight: ");
        int newWeight = scan.nextInt();

        int[] updatedWeights = new int[weightRecords[personNumber].length + 1];
        System.arraycopy(weightRecords[personNumber], 0, updatedWeights, 0, weightRecords[personNumber].length);
        updatedWeights[updatedWeights.length - 1] = newWeight;
        weightRecords[personNumber] = updatedWeights;
    }

    // (b) Function to calculate the minimum weight of a person
    static void findMinimumWeight(int[][] weightRecords, Scanner scan) {
        System.out.print("Enter the person number to find minimum weight: ");
        int personNumber = scan.nextInt() - 1;
        if (personNumber < 0 || personNumber >= weightRecords.length || weightRecords[personNumber].length == 0) {
            return;
        }

        int minWeight = weightRecords[personNumber][0];
        for (int weight : weightRecords[personNumber]) {
            if (weight < minWeight) {
                minWeight = weight;
            }
        }
        System.out.println("Minimum weight of person " + (personNumber + 1) + ": " + minWeight);
    }
}
