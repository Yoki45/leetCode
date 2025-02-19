package org.leetcode;

public class FizzBuzz {

    public static void main(String[] args) {

        Integer n = 15;

        long startTime = System.nanoTime();

        fizzBuzz(n);

        long endTime = System.nanoTime();

        System.out.println("execution time :" + (endTime- startTime));


    }

    private static void fizzBuzz(Integer n) {
        for(int i = 1; i <= n; i++) {
            Boolean isMultipleBy3 = i % 3 == 0;
            Boolean isMultipleBy5 = i % 5 == 0;
            if(isMultipleBy3 && isMultipleBy5) {
                System.out.println("FizzBuzz");
            } else if(isMultipleBy3) {
                System.out.println("Fizz");
            } else if(isMultipleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

    }
    }
}
