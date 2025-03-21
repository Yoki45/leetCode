package org.leetcode.arrays;

public class AscendingDifference {

    public static void main(String[] args) {

        int [] array = {6,2,3,4,5,6,8,9};

/*
         This will be reassigned
*/
        int low = array[0];
/*
         This will be reassigned
*/
        int high = 0;

        int current =  1;
/*
        This should be used to check for the index of the minimum value
*/
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            /*
             * This block of code aims to achieve the following:
             * 1. Find the lowest value on the left-hand side, ensuring there are numbers on the right.
             * 2. Then find the highest number on the right.
             */
           current = array[i];

            if (low > current && current != array[array.length-1] ) {
                low = current;
                index = i;
            }
            /* Find the highest value on the right side
            * */
            if (low < current && current > array[index] ) {
                high = current;
            }

//            if (index != -1) { // Ensure a valid lowest value was found
//                for (i = index + 1; i < array.length; i++) {
//                    if (array[i] > high) {
//                        high = array[i];
//                    }
//                }
//            }

        }

        System.out.println("high"  + " "  + high);
        System.out.println("low"  +  " " +  low);
        if(low > high){
            System.out.println( "-1");
        } else {
            System.out.println(high - low);
        }

    }
}
