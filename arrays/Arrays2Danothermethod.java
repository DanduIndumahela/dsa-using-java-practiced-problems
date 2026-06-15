//package arrays;
import java.util.*;

public class Arrays2Danothermethod {
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        Scanner sc = new Scanner(System.in);
        
        // Input elements into the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        
        // Close the scanner to prevent resource leaks
        sc.close();

        // Print the 2D array using Arrays.toString()
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
