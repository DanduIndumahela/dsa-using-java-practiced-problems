import java.util.*;

public class SpiralmatrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int[][] matrix = new int[n][n];

        // Filling the matrix in spiral order
        while (num <= n * n) {
            for (int i = left; i <= right && num <= n * n; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom && num <= n * n; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left && num <= n * n; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top && num <= n * n; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // ✅ Print the matrix only ONCE after filling it
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
