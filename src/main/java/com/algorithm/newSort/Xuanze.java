package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/7/18 12:38
 */
public class Xuanze {
    public static int[] xuanze(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1;j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        return array;
    }
}
