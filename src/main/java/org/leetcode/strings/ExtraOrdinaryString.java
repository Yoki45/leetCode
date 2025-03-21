package org.leetcode.strings;

public class ExtraOrdinaryString {

    public static void main(String[] args) {

        countSubstrings("hello");

    }


    static int countSubstrings(String input_str) {
        int[] charAlphabets = new int[26]; // Array to store mapped values of each character
        String[] phoneMappings = {"ab", "cde", "fgh", "ijk", "lmn", "opq", "rst", "uvw", "xyz"};

        // Filling the charAlphabets array with the mapped values
        for (int i = 0; i < phoneMappings.length; i++) {
            for (char ch : phoneMappings[i].toCharArray()) {
                charAlphabets[ch - 'a'] = i + 1; // Mapping 'a' -> 1, 'b' -> 1, 'c' -> 2, etc.
            }
        }

        Integer totalCount = 0; // Variable to count total extraordinary substrings
        Integer stringInputLength = input_str.length(); // Length of the input string

        // Loop through all possible substrings of input_str
        for (int i = 0; i < stringInputLength; i++) {
            Integer sum = 0; // Initialize the sum of character values for the current substring
            // Inner loop to form substrings starting from i
            for (int j = i; j < stringInputLength; j++) {
                sum += charAlphabets[input_str.charAt(j) - 'a']; // Add mapped value of current character
                Integer length = j - i + 1; // Length of the current substring

                // Check if the sum is divisible by the length of the substring
                if (sum % length == 0) {
                    totalCount++; // Increment the count if condition is met
                }
            }
        }
        return totalCount; // Return the total count of extraordinary substrings
    }


}
