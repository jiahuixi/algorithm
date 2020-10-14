package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/7/18 12:50
 */
public class GuiBing {
    public static int[] guibing(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        return guibing(arr, l, h);
    }

    private static int[] guibing(int[] arr, int l, int r) {
        int mid = l + (r - l) / 2;
        if (l < r) {
            guibing(arr, l, mid);
            guibing(arr, mid + 1, r);
            guibing(arr, l, mid , r);
        }
        return arr;
    }

    private static void guibing(int[] arr, int l, int mid, int r) {
        int[] arraytemp = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                arraytemp[k++] = arr[i++];
            } else  {
                arraytemp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            arraytemp[k++] = arr[i++];
        }
        while(j<=r){
            arraytemp[k++] = arr[j++];
        }
        for(int x = 0 ; x <arraytemp.length ; x++){
            arr[l+x] = arraytemp[x];
        }
    }
}
