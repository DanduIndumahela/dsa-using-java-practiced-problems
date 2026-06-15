package Recursion.Arrayrecursion;

public class Target {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 88, 99 };
        System.out.println(search(arr, 66, 0));
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }
}
