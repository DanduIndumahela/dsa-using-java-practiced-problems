import java.util.*;

public class Oddvalues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.println("Enter matrix dimensions (m n):");
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Input number of operations
        System.out.println("Enter number of operations:");
        int operations = sc.nextInt();
        int[][] indices = new int[operations][2];

        // Input indices using inner loop
        System.out.println("Enter indices:");
        for (int i = 0; i < operations; i++) {
            for (int j = 0; j < 2; j++) {
                indices[i][j] = sc.nextInt();
            }
        }

        // Get count of odd-valued cells
        int result = oddCells(m, n, indices);
        System.out.println("Number of odd-valued cells: " + result);

        sc.close();
    }

    // Function to count odd-valued cells after applying operations
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        // Apply row and column increments
        for (int[] index : indices) {
            int row = index[0], col = index[1];
            incrementRow(matrix, row, n);
            incrementColumn(matrix, col, m);
        }

        // Debugging: Print final matrix
        System.out.println("Final Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Count odd values
        return countOdd(matrix);
    }

    // Function to increment a row
    public static void incrementRow(int[][] matrix, int row, int n) {
        for (int j = 0; j < n; j++) {
            matrix[row][j]++;
        }
    }

    // Function to increment a column
    public static void incrementColumn(int[][] matrix, int col, int m) {
        for (int i = 0; i < m; i++) {
            matrix[i][col]++;
        }
    }

    // Function to count odd values in the matrix
    public static int countOdd(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
