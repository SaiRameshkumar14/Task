
import java.util.*;

public class SpiralMatrixPrinting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get matrix size from the user
        System.out.print("Enter the size of the matrix (N): ");
        int matrixSize = scan.nextInt();

        int[][] spiralMatrix = generateSpiralMatrix(matrixSize);

        // Print the generated spiral matrix
        System.out.println("Generated Spiral Matrix:");
        for (int[] row : spiralMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Function to generate an NxN spiral matrix
    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];

        int topBoundary = 0, bottomBoundary = n - 1;
        int leftBoundary = 0, rightBoundary = n - 1;
        int value = 1;

        while (value <= n * n) {
            // Move from left to right
            for (int col = leftBoundary; col <= rightBoundary; col++) {
                matrix[topBoundary][col] = value++;
            }
            topBoundary++;

            // Move from top to bottom
            for (int row = topBoundary; row <= bottomBoundary; row++) {
                matrix[row][rightBoundary] = value++;
            }
            rightBoundary--;

            // Move from right to left
            for (int col = rightBoundary; col >= leftBoundary; col--) {
                matrix[bottomBoundary][col] = value++;
            }
            bottomBoundary--;

            // Move from bottom to top
            for (int row = bottomBoundary; row >= topBoundary; row--) {
                matrix[row][leftBoundary] = value++;
            }
            leftBoundary++;
        }
        return matrix;
    }
}
