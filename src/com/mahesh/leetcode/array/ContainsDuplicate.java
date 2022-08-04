package com.mahesh.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] input = new int[]{2, 1, 5, 1};
        System.out.println(containsDuplicate(input));
    }
}
