package org.leetcode.strings;

public class ReverseInteger {


    public static void main(String[] args) {

        reverseInteger();


    }

    private static Integer reverseInteger() {
        Integer x = 123;
        Integer result = 0;

        while (x != 0) {
            Integer reminder = x % 10;
            Integer temp = (result * 10) + reminder;

            if ((temp - reminder) / 10 != result) {
                System.out.println(0);
                return 0;

            }
            x = x / 10;
            result = temp;
        }

        System.out.println(result);

        return result;
    }
}
