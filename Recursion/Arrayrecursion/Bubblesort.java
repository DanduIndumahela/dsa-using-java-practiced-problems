package Recursion.Arrayrecursion;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 6, 99, 88, 55, 5, 98, 89, 68 };
        bubblesort(arr, arr.length - 1, 0);
        System.out.print(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr, int roww, int coll) {
        if (roww == 0) {
            return;
        }
        if (coll < roww) {
            if (arr[coll] > arr[coll + 1]) {
                int temp = arr[coll];
                arr[coll] = arr[coll + 1];
                arr[coll + 1] = temp;
            }
            bubblesort(arr, roww, coll + 1);
        } else {
            bubblesort(arr, roww - 1, 0);
        }
    }
}
