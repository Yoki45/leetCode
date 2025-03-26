package org.leetcode.arrays;

public class testGorillaCordiality {

    public static void main(String[] args) {

        int [] nums = {1,2,3};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                sum += nums[i];
            } else {
                sum -= nums[i];
            }

        }

        boolean isDivisibleBy2 = sum % 2 == 0;
        boolean isDivisibleBy3 = sum % 3 == 0;
        boolean isDivisibleBy6 = sum % 6 == 0;

        Integer result = sum;
        if (isDivisibleBy6) {
            result = result * 6;
        } else if (isDivisibleBy2) {
            result = result * 2;
        } else if (isDivisibleBy3) {
            result = result * 3;
        }

        System.out.println(result);

    }
}
