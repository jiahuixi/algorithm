package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/7/18 12:31
 */
public class ChaRU {
    public static int[] charu(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int e = array[i];
            int j;
            for (j = i; j > 0; j--) {
                if (e < array[j - 1]) {
                    array[j] = array[j - 1];
                }else{
                    break;
                }
            }
            array[j] = e;
        }
        return array;


    }
}
