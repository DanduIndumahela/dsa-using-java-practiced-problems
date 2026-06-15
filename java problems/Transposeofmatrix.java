import java.util.*;

public class Transposeofmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];

        // Taking input for matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Transposing the matrix
        int[][] transposedMatrix = transpose(matrix);

        // Printing the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(transposedMatrix[i]));
        }
    }

    // Transposing the matrix
    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposedMatrix = new int[m][n];

        // Transposing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;  // Returning the transposed matrix
    }
}
