import java.util.*;

public class Orderagnostic0 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // Sorted in ascending order
        int target = 9;
        int ans = orderAgnostic(arr, target);
        
        if (ans != -1) {
            System.out.println("Target found at index: " + ans);
        } else {
            System.out.println("Target not found.");
        }
    }

    static int orderAgnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; // Corrected Boolean declaration

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAsc) { // Ascending order case
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Descending order case
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }
}
