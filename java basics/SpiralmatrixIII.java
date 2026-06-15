import java.util.*;

public class SpiralmatrixIII {
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2]; // Result array to store positions
        int index = 0; // Track visited cells
        
        // Directions: Right, Down, Left, Up
        int[] dr = {0, 1, 0, -1}; // Row movement
        int[] dc = {1, 0, -1, 0}; // Column movement
        
        int r = rStart, c = cStart; // Starting position
        result[index++] = new int[]{r, c}; 
        
        int step = 1; // Step size starts at 1
        
        while (index < rows * cols) {
            for (int i = 0; i < 4; i++) {  // Loop through all 4 directions
                int steps = step + (i / 2); // Increase step size every 2 turns
                for (int j = 0; j < steps; j++) {
                    r += dr[i]; // Move row-wise
                    c += dc[i]; // Move column-wise
                    
                    // Check if inside the grid before adding to result
                    if (r >= 0 && r < rows && c >= 0 && c < cols) { 
                        result[index++] = new int[]{r, c}; 

                        // Ensure index does not exceed the array limit
                        if (index == rows * cols) {
                            return result; // Stop when all positions are visited
                        }
                    }
                }
            }
            step += 1; // Increase step size after completing two directions
        }
        
        return result;
    }
    
    // Helper method to print the result
    public static void printMatrix(int[][] matrix) {
        for (int[] cell : matrix) {
            System.out.print(Arrays.toString(cell) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for rows, cols, rStart, and cStart
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = scanner.nextInt();
        System.out.print("Enter starting row index (rStart): ");
        int rStart = scanner.nextInt();
        System.out.print("Enter starting column index (cStart): ");
        int cStart = scanner.nextInt();
        
        scanner.close(); // Close the scanner

        // Generate the spiral matrix path
        int[][] result = spiralMatrixIII(rows, cols, rStart, cStart);
        
        // Print the output
        printMatrix(result);
    }
}
