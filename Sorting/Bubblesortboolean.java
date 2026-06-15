package Sorting;

import java.util.Arrays;

public class Bubblesortboolean {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        booleanBubbleSort(arr);  // ✅ fixed method call
        System.out.println(Arrays.toString(arr));
    }

    static void booleanBubbleSort(int[] arr) {  // ✅ fixed method name
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {  // ✅ fixed loop range
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;  // array is already sorted
            }
        }
    }
}