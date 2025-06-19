
import java.util.*;

public class MatrixMultiply {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get dimensions of the first matrix
        System.out.print("Enter number of rows in first matrix: ");
        int firstMatrixRows = scan.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        int firstMatrixCols = scan.nextInt();

        // Get dimensions of the second matrix
        System.out.print("Enter number of rows in second matrix: ");
        int secondMatrixRows = scan.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        int secondMatrixCols = scan.nextInt();

        // Check matrix multiplication validity
        if (firstMatrixCols != secondMatrixRows) {
            System.out.println("Matrix multiplication is not possible (Columns of First Matrix must match Rows of Second Matrix).");
        }

        // Initialize matrices
        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];
        int[][] resultMatrix = new int[firstMatrixRows][secondMatrixCols];

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < firstMatrixCols; col++) {
                System.out.print("Enter Element in " + row + "" + col + ": ");
                firstMatrix[row][col] = scan.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int row = 0; row < secondMatrixRows; row++) {
            for (int col = 0; col < secondMatrixCols; col++) {
                System.out.print("Enter Element in " + row + "" + col + ": ");
                secondMatrix[row][col] = scan.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int row = 0; row < firstMatrixRows; row++) {
            for (int col = 0; col < secondMatrixCols; col++) {
                resultMatrix[row][col] = 0;
                for (int k = 0; k < firstMatrixCols; k++) {
                    resultMatrix[row][col] += firstMatrix[row][k] * secondMatrix[k][col];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int[] row : resultMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
