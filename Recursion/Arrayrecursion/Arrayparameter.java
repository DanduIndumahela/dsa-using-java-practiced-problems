package Recursion.Arrayrecursion;

import java.util.ArrayList;

public class Arrayparameter {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 8, 8 };
        // System.out.println(find(arr, 8, 0, new ArrayList<>()));
        // ArrayList<Integer> ans = find(arr, 8, 0, new ArrayList<>());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = find(arr, 8, 0, list);
        System.out.println(ans);
        System.out.println(ans);
    }

    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index + 1, list);
    }
}
