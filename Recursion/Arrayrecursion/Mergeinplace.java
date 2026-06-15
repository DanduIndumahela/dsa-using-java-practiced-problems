package Recursion.Arrayrecursion;

import java.util.Arrays;

public class Mergeinplace {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        mergeinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4]
    }

    static void mergeinplace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeinplace(arr, start, mid);
        mergeinplace(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mixx = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mixx[k++] = arr[i++];
            } else {
                mixx[k++] = arr[j++];
            }
        }

        while (i < mid) {
            mixx[k++] = arr[i++];
        }

        while (j < end) {
            mixx[k++] = arr[j++];
        }

        for (int l = 0; l < mixx.length; l++) {
            arr[start + l] = mixx[l];
        }
    }
}
