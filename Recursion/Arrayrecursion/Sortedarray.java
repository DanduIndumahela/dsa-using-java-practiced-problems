package Recursion.Arrayrecursion;

public class Sortedarray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 55, 66, 88, 99 };
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
