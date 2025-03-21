package org.leetcode.arrays;

public class BestTimeToSell {


    public static void main(String[] args) {

        Integer maxProfit = 0;

        int [] sales = {3,4,1,6,11,8,6,10};

        for(int i = 0; i < sales.length - 1; i++) {
            if(sales[i +1 ] > sales[i]) {
                maxProfit += sales[i+1] - sales[i];
            }

        }

        System.out.println(maxProfit);
    }
}
