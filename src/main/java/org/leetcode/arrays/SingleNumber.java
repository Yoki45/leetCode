package org.leetcode.arrays;

public class SingleNumber {


    public static void main(String[] args) {
        System.out.println();
    }





    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
