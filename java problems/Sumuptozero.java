import java.util.Scanner;
import java.util.Arrays;

public class Sumuptozero {
    
    public static boolean checkSumZero(int[] arr, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum == 0; // If sum is zero, return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take n input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Take array input from user
        System.out.println("Enter " + n + " unique integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array sum is zero
        if (checkSumZero(arr, n)) {
            System.out.println("Valid input! Your array sums to zero: " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid input! The array does not sum to zero.");
        }

        scanner.close();
    }
}