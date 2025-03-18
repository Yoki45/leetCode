package org.leetcode;

import java.util.Arrays;

public class RemoveDuplicatedValuesInSortedArray {


    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3,4,5,5,6,6,7,7,8};

        Integer lastUniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[lastUniqueIndex]) {
                nums[lastUniqueIndex + 1]  = nums[i];
                lastUniqueIndex++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(nums, lastUniqueIndex + 1)));
       // System.out.println(Arrays.stream(nums).distinct().count());
        System.out.println(lastUniqueIndex + 1);

    }
}
