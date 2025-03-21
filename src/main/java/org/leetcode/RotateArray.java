package org.leetcode;

public class RotateArray {


    public static void main(String[] args) {

        Integer k = 3;

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        rotate(nums,0, nums.length-1);

        rotate(nums,0, k);

        rotate(nums,k-1, nums.length-1);

    }

    public static void rotate(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
