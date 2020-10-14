package com.algorithm;

/**
 * @author wenhe
 * @date 2020/8/19 15:24
 */
public class Utils {
    public  static void print(char[][] matrix) {
        int row = matrix.length ;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }
}
