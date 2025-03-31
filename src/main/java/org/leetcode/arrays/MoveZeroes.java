package org.leetcode.arrays;

import java.util.Arrays;

public class MoveZeroes {


    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);


    }


    public static int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) return nums;

        int j = 0;
        int i = 1;

        while (i < nums.length) {
            if (nums[j] != 0) {
                j++;
                i++;
            } else if (nums[i] == 0) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
