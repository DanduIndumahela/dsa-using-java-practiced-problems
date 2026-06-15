import java.util.Scanner;

public class Luckynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter elements in matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Call the function to print lucky numbers
        findLuckyNumbers(matrix, n, m);
    }

    // Function to find and print lucky numbers
    public static void findLuckyNumbers(int[][] matrix, int n, int m) {
        System.out.println("Lucky Numbers in Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int minrow = findMinRow(matrix, i);
                int maxcol = findMaxCol(matrix, j);

                if (matrix[i][j] == minrow && matrix[i][j] == maxcol) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    // Function to find the minimum value in a row
    public static int findMinRow(int[][] matrix, int row) {
        int min = matrix[row][0];
        for (int j = 1; j < matrix[row].length; j++) {
            if (matrix[row][j] < min) {
                min = matrix[row][j];
            }
        }
        return min;
    }

    // Function to find the maximum value in a column
    public static int findMaxCol(int[][] matrix, int col) {
        int max = matrix[0][col];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] > max) {
                max = matrix[i][col];
            }
        }
        return max;
    }
}
