package org.leetcode.maths;

public class ReverseString {

    public static void main(String[] args) {


        char[] str = {'h', 'e', 'l', 'l', 'o'};

        for (int i = 0; i < str.length / 2; i++) {
            char temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }

        System.out.println(str);

    }

}
