
import java.util.*;

public class TransposedMatrix {

    public static void main(String[] args) {
        // Define original matrix
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Get matrix dimensions
        int originalRows = originalMatrix.length;
        int originalCols = originalMatrix[0].length;

        // Initialize transposed matrix with swapped dimensions
        int[][] transposedMatrix = new int[originalCols][originalRows];

        // Compute the transpose
        for (int row = 0; row < originalCols; row++) {
            for (int col = 0; col < originalRows; col++) {
                transposedMatrix[row][col] = originalMatrix[col][row];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix");
        for (int[] row : transposedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
