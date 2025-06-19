
import java.util.Scanner;

public class JaggedArrayWeights {

    public static int getMinWeight(int[] weightArray) {
        int min = weightArray[0];
        for (int weight : weightArray) {
            if (weight < min) {
                min = weight;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int personCount = scanner.nextInt();

        int[][] personWeights = new int[personCount][];

        for (int person = 0; person < personCount; person++) {
            System.out.print("Enter the number of weights for person " + (person + 1) + ": ");
            int weightCount = scanner.nextInt();
            personWeights[person] = new int[weightCount];
        }

        System.out.println("Enter the weights for each person:");
        for (int person = 0; person < personCount; person++) {
            for (int w = 0; w < personWeights[person].length; w++) {
                System.out.print("Enter weight " + (w + 1) + " for person " + (person + 1) + ": ");
                personWeights[person][w] = scanner.nextInt();
            }
        }

        System.out.print("Enter the person index to calculate the minimum weight (1 to " + personCount + "): ");
        int selectedPersonIndex = scanner.nextInt() - 1;

        if (selectedPersonIndex < 0 || selectedPersonIndex >= personCount) {
            System.out.println("Invalid person index!");
        } else {
            int minWeight = getMinWeight(personWeights[selectedPersonIndex]);
            System.out.println("The minimum weight of person " + (selectedPersonIndex + 1) + " is: " + minWeight);
        }

        scanner.close();
    }
}
