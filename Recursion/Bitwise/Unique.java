package Recursion.Bitwise;

public class Unique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 2, 1, 3, 6, 4 };
        // unique(arr);

        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}