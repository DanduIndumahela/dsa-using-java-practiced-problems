package Sorting;

import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selectionSort(arr);  // no return needed
        System.out.println(Arrays.toString(arr));  // print the sorted array
    }
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap arr[i] with arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
