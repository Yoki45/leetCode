package org.leetcode.arrays;

public class RotateImage {

    public static void main(String[] args) {

    }



    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = i; j < matrix.length ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }


        // after transposing, reverse  each row individually.
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length/2 ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-1-j] = temp;
            }
        }


    }
}
