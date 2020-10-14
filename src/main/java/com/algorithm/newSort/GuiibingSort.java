package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/8/19 14:14
 */
public class GuiibingSort {
    public static int[] mergeSort(int array[]) {
        int l = 0;
        int h = array.length - 1;
        return merge(array, l, h);
    }

    private static int[] merge(int[] array, int l, int h) {
        int mid = l + (h - l) / 2;
        if (l < h) {
            merge(array, l, mid);
            merge(array, mid + 1, h);
            mergeSort(array, l, mid, h);
        }
        return array;
    }

    private static void mergeSort(int[] array, int l, int mid, int h) {
        int[] arrayTemp = new int[h - l + 1];
        int i = l;
        int j = mid + 1;
        int p = 0;
        while (i <= mid && j <= h) {
            if (array[i] < array[j]) {
                arrayTemp[p++] = array[i++];
            } else {
                arrayTemp[p++] = array[j++];
            }
        }
        while (i <= mid) {
            arrayTemp[p++] = array[i++];
        }
        while (j <= h) {
            arrayTemp[p++] = array[j++];
        }
        for (int x = 0; x < arrayTemp.length; x++) {
            array[x + l] = arrayTemp[x];
        }
    }
}
