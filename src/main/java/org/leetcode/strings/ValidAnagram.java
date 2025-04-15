package org.leetcode.strings;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        Boolean isAnagram = isAnagram("anagram", "nagaram");
        System.out.println(isAnagram);


    }

//    public  static  boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//        return Arrays.equals(sArr, tArr);
//    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }


}
