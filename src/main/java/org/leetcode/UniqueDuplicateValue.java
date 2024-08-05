package org.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueDuplicateValue {

    public static void main(String[] args) {


        String s1 = "get";
        String s2 = "etg";

        int results = getDuplicateValue(s1, s2);
        System.out.println(results);
    }

    static int getDuplicateValue(String s,String t) {

        /*
        * First handle if the two strings are empty        *
        * */

        if(s.length() == 0 ||  t.length() == 0) return 0;
        List<String> shortest = new ArrayList<>();
        List<String> longest = new ArrayList<>();

        /*
        * Add unique characters to this empty string.
        * */

        String duplicateCharacters = " ";
        int count = 0;

        List<String> word1 = helper(s); // word1 has unique characters as a list
        List<String> word2 = helper(t); // word2 has unique characters as a list

        shortest = word1.size() > word2.size() ? word2 : word1;
        longest = shortest.equals(word1) ? word2 : word1;


        // compare two inputs and get unique count and print
        for (int i = 0; i < shortest.size(); i++) {
            for (int j = 0; j < longest.size(); j++) {

                if (shortest.get(i).equalsIgnoreCase(longest.get(j))) {
                    duplicateCharacters += longest.get(j); // store duplicate values
                    count++;
                }
            }
        }

        System.out.println(duplicateCharacters);
        return count;

    }

     /*
     * This returns the characters of in a list.
     * */
    static List<String> helper (String str){
        // Handle duplicate string characters
        Set<String> set = new HashSet<>();

        for(int i=0; i< str.length(); i++){
            set.add(String.valueOf(str.charAt(i)) );
        }

        List<String> list = new ArrayList<>(set);
        return list;
    }
}
