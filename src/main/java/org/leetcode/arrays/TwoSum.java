package org.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 22;

        findTwoSum(nums, target);


    }

    private static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (map.containsKey(diff)) {
                int[] newArray = new int[2];
                newArray[0] = map.get(diff);
                newArray[1] = i;
                System.out.println(Arrays.toString(newArray));
               // return  new int[]{map.get(diff), i};
                return newArray;
            } else {
                map.put(nums[i], i);
            }


        }

        return null;
    }

}
