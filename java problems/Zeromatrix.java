/*Set Matrix Zeroes
import java.util.*;
public class Zeromatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        setzero(matrix);
        printMatrix(matrix); // Correctly prints the matrix

       // System.out.println(result);

    }
    public static void setzero(int [][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        boolean[] rowflag=new boolean[row];
        boolean[] colflag=new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rowflag[i]=true;
                    colflag[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowflag[i]||colflag[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
    */
    import java.util.*;

    public class Zeromatrix {
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
            };
    
            System.out.println("Original Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i])); // Print each row
            }
    
            setzero(matrix); // Modify the matrix
    
            System.out.println("\nTransformed Matrix:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(Arrays.toString(matrix[i])); // Print each row
            }
        }
    
        public static void setzero(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            boolean[] rowflag = new boolean[row];
            boolean[] colflag = new boolean[col];
    
            // Step 1: Mark rows and columns that should be zeroed
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        rowflag[i] = true;
                        colflag[j] = true;
                    }
                }
            }
    
            // Step 2: Update the matrix
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (rowflag[i] || colflag[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
    
