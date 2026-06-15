package Recursion.Arrayrecursion;

import java.util.ArrayList;

public class Arraysnotinarguments {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 8, 8 };
        System.out.println(find(arr, 8, 0));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        // ArrayList<Integer> addallfrombelow = find(arr, target, index + 1);
        // list.addAll(addallfrombelow);
        // return list;
        return find(arr, target, index + 1);
    }
}