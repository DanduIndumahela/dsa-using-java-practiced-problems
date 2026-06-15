package Recursion.Stringsrecurion;

import java.util.*;

public class Subaetduplicates {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        List<List<Integer>> anss = subsetduplicates(nums);
        for (List<Integer> list : anss) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetduplicates(int[] nums) {
        Arrays.sort(nums); // Sort first
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
