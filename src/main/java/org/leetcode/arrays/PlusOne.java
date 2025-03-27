package org.leetcode.arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {9,9,9};
        plusOne(nums);
    }


    public static int[] plusOne(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;

            }

            nums[i] = 0;
        }

        int[] res = new int[nums.length + 1];
        res[0] = 1;
        System.out.println(res);
        return res;
    }
}
