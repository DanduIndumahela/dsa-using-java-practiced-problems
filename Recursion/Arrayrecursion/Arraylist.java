package Recursion.Arrayrecursion;

import java.util.ArrayList;

public class Arraylist {

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) { // Base case
            return;
        }
        if (arr[index] == target) { // Match found
            list.add(index);
        }
        findAllIndex(arr, target, index + 1); // Recursive call
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 8, 9 };
        int target = 4;

        findAllIndex(arr, target, 0);

        System.out.println(list); // Output: [3, 4]
    }
}
