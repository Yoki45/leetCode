package org.leetcode;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int[] A = {6, 2, 3, 4, 5, 6, 8, 9};

        Arrays.stream(A).filter(x -> x > 0).sorted().distinct().toArray();

        int smallestMissing = 1;
        for (int num : A) {
            if (num == smallestMissing) {
                smallestMissing++;
            } else if (num > smallestMissing) {
                break;
            }
        }

        System.out.println(smallestMissing);

    }

    }
