package Recursion.Arrayrecursion;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] array = { 99, 88, 66, 55, 89, 98, 88, 99 };
        selectionsort(array, array.length - 1, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    static void selectionsort(int[] arr, int roww, int coll, int maxx) {
        if (roww == 0) {
            return;
        }
        if (coll < roww) {
            if (arr[coll] > arr[maxx]) {
                selectionsort(arr, roww, coll + 1, coll);
            } else {
                selectionsort(arr, roww, coll + 1, maxx);
            }
        } else {
            int temp = arr[maxx];
            arr[maxx] = arr[roww - 1];
            arr[roww - 1] = temp;
            selectionsort(arr, roww - 1, 0, 0);
        }
    }
}
