package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/7/18 15:01
 */
public class Kuaipai {
    public static int[] kuaipai(int[] array) {
        kuaipai(array, 0, array.length - 1);
        return array;
    }

    private static void kuaipai(int[] array, int l, int r) {
        if (l > r) {
            return;
        }
        int p = partition(array, l, r);
        kuaipai(array, p + 1, r);
        kuaipai(array, l, p - 1);
    }

    private static int partition(int[] array, int l, int r) {
        int p = array[l];
        int i = l+1;
        int j = r;
        while (true) {
            while (i <= r && array[i] < p) {
                    i++;
            }
            while (j >=l+1 && array[j]> p) {
                j--;
            }
            if(i>j){
                break;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        array[l] = array[j];
        array[j] = p;
        return j;
    }

}
