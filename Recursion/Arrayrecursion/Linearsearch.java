package Recursion.Arrayrecursion;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 9, 0, 88 };
        System.out.println(linearsearch(arr, 5, 0));
    }

    static int linearsearch(int[] arr, int target, int index) {
        if (target == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearsearch(arr, target, index + 1);
        }
    }
}
