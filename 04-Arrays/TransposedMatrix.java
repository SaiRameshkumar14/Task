//2.Write a program to find transpose of a matrix

import java.util.*;

public class TransposedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transposeArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                transposeArr[i][j] = arr[j][i];
            }
        }
        System.out.println("Transposed Matrix");
        for (int[] row : transposeArr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
