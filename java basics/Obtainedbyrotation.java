import java.util.*;

public class Obtainedbyrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int[][] target = new int[n][n];

        System.out.println("Enter mat:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = sc.nextInt();
            }
        }

        boolean result = findrotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
    }

    public static boolean findrotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < 4; i++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            rotatematrix90(mat);
        }
        return false;
    }

    public static void rotatematrix90(int[][] mat) {
        transposematrix(mat);
        reverserows(mat);
    }

    public static void transposematrix(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void reverserows(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static boolean areMatricesEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
/*import java.util.*;

public class Obtainedbyrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for matrix size
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int[][] target = new int[n][n];

        System.out.println("Enter mat:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter target:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[i][j] = sc.nextInt();
            }
        }

        boolean result = findrotation(mat, target);
        System.out.println("Can mat be rotated to match target? " + result);
        
        sc.close();
    }

    public static boolean findrotation(int[][] mat, int[][] target) {
        int n = mat.length;
        
        // Try all 4 possible 90-degree rotations
        for (int i = 0; i < 4; i++) {
            if (areMatricesEqual(mat, target)) {
                return true; // Found a match
            }
            rotatematrix90(mat);
            
            // Debugging: Print intermediate matrices after rotation
            System.out.println("After " + (i + 1) * 90 + " degree rotation:");
            printMatrix(mat);
        }
        return false;
    }

    public static void rotatematrix90(int[][] mat) {
        transposematrix(mat);
        reverserows(mat);
    }

    public static void transposematrix(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    public static void reverserows(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static boolean areMatricesEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/