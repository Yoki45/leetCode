package org.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = {

                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        isValidSudoku(board);
    }


    public static boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String rowKey = "row" + i + board[i][j];
                    String colKey = "col" + j + board[i][j];
                    String subgridKey = "subgrid" + (i / 3) + (j / 3) + board[i][j];

                    if (seen.contains(rowKey) || seen.contains(colKey) || seen.contains(subgridKey)) {
                        return false;
                    }

                    seen.add(rowKey);
                    seen.add(colKey);
                    seen.add(subgridKey);
                }

                System.out.println(seen);
            }
        }
        return true;
    }


}
