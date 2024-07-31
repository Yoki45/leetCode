package org.leetcode;

public class CommonCharacters {

    public static void main(String[] args) {

        //Remember that Java is case sensitive

        String one = "stephen";
        String two = "message";

        commonCharacters(one, two);
    }

    static void commonCharacters(String str1, String str2) {
        // This should store the results, the common characters in this case.
        String commonCharacter =  " ";

        if (str1.length() == 0 || str2.length() == 0) return;

        //Find the shortest string of the two
        String shortest = str1.length() > str2.length() ? str2 : str1;

        //Find the longest string
        String longest = shortest.equals(str1) ? str2 : str1;

        //Iterate through the shortest string
        for (int i = 0; i < shortest.length(); i++) {
            String char1 = Character.toString(shortest.charAt(i));
            if(longest.contains(char1)){
                commonCharacter += char1;
            }
        }

        System.out.println("Common characters: " + commonCharacter);
    }
}
