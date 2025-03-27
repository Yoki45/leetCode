package org.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {


    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9};

        boolean duplicates= containsDuplicate(nums);
        System.out.println(duplicates);


    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
