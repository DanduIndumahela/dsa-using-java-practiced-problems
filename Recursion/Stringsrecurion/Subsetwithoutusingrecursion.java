package Recursion.Stringsrecurion;

import java.util.List;
import java.util.ArrayList;

public class Subsetwithoutusingrecursion {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        List<List<Integer>> anss = subset(nums);
        System.out.println(anss);
    }

    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int j = 0; j < nums.length; j++) {
            int nm = nums[j];
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList(outer.get(i));
                inner.add(nm);
                outer.add(inner);
            }
        }
        return outer;
    }
}
