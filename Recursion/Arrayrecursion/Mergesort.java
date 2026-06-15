package Recursion.Arrayrecursion;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mixx = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mixx[k] = first[i];
                i++;
            } else {
                mixx[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mixx[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mixx[k] = second[j];
            j++;
            k++;
        }
        return mixx;
    }
}
