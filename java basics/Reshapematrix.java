import java.util.*;

public class Reshapematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read original matrix size
        int n = sc.nextInt(); // Rows
        int m = sc.nextInt(); // Columns
        System.out.println("Original matrix dimensions: " + n + "x" + m);

        int[][] mat = new int[n][m];

        // Read matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

        // Read new dimensions for reshaping
        int r = sc.nextInt(); // New rows
        int c = sc.nextInt(); // New columns
        System.out.println("Requested reshape dimensions: " + r + "x" + c);

        // Call function to reshape matrix
        int[][] result = matrixreshape(mat, r, c);

        // Print the reshaped matrix correctly
        System.out.println("Reshaped Matrix:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i])); // Print each row properly
        }

        sc.close(); // Close Scanner to avoid memory leaks
    }

    public static int[][] matrixreshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;

        // If reshape is not possible, return original matrix
        if (n * m != r * c) {
            System.out.println("Reshape not possible, returning original matrix.");
            return mat;
        }

        // Create reshaped matrix
        int[][] reshapedMatrix = new int[r][c];
        int index = 0;

        // Fill reshaped matrix using 1D index conversion
        System.out.println("Filling reshaped matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                reshapedMatrix[index / c][index % c] = mat[i][j];
                System.out.println("Moving element " + mat[i][j] + " to position [" + (index / c) + "][" + (index % c) + "]");
                index++;
            }
        }
        return reshapedMatrix;
    }
}
