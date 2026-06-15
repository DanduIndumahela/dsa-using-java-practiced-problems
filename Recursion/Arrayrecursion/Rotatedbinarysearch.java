package Recursion.Arrayrecursion;

public class Rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        System.out.println(binarysearch(arr, 99, 0, arr.length - 1)); // Output: 4
        System.out.println(binarysearch(arr, 10, 0, arr.length - 1)); // Output: -1
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        // Edge case: target not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Edge case: target found at mid
        if (arr[mid] == target) {
            return mid;
        }

        // If left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return binarysearch(arr, target, start, mid - 1);
            } else {
                return binarysearch(arr, target, mid + 1, end);
            }
        }

        // If right half is sorted
        if (target >= arr[mid] && target <= arr[end]) {
            return binarysearch(arr, target, mid + 1, end);
        } else {
            return binarysearch(arr, target, start, mid - 1);
        }
    }
}
