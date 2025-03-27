package org.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class ArrayIntersection {


    public static void main(String[] args) {
        int[] array1 = {5, 6, 7, 7, 8, 9};
        int[] array2 = {6, 7, 10, 7, 11, 12};

        arrayIntersection(array1, array2);
    }


    public static int[] arrayIntersection(int[] nums1, int[] nums2) {

        Hashtable<Integer, Integer> numberFrequencies = new Hashtable<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (numberFrequencies.containsKey(nums1[i])) {
                numberFrequencies.put(nums1[i], numberFrequencies.get(nums1[i]) + 1);
            } else {
                numberFrequencies.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (numberFrequencies.containsKey(nums2[i])) {
                integerArrayList.add(nums2[i]);
                numberFrequencies.put(nums2[i], numberFrequencies.get(nums2[i]) - 1);

                if (numberFrequencies.get(nums2[i]) == 0) {
                    numberFrequencies.remove(nums2[i]);
                }
            }
        }

        int[] result = new int[integerArrayList.size()];

        for (int j = 0; j < integerArrayList.size(); j++) {
            result[j] = integerArrayList.get(j);
        }

        System.out.println(Arrays.stream(result).toArray());
        return result;

    }

}
