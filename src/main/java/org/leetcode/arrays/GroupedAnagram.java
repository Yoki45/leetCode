package org.leetcode.arrays;

import java.util.*;

public class GroupedAnagram {


    public static void main(String[] args) {


        List<String> stringList = List.of("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String,List<String>> groupedAnagram = new HashMap<>();

        for (String string : stringList) {
            char[] sorted = string.toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);


           // groupedAnagram.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(string);


            if (groupedAnagram.containsKey(sortedString)) {
                groupedAnagram.get(sortedString).add(string);
            } else {
                groupedAnagram.put(sortedString, new ArrayList<>(Arrays.asList(string)));
            }

        }

        //System.out.println(groupedAnagram);
        System.out.println(new ArrayList<>(groupedAnagram.values()));
    }
}
