package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/8/19 14:02
 */
public class KuaisuPaixu {
    public static int []  kuaisu(int arr[]){
        int l = 0;int h = arr.length-1;
        kuaisu(arr,l,h);
        return arr;
    }

    private static void kuaisu(int[] arr, int l, int h) {
        if(l>=h){
            return;
        }
        int  p =patation(arr,l,h);

        kuaisu(arr,l,p-1);
        kuaisu(arr,p+1,h);
    }

    private static int patation(int[] arr, int l, int h) {
        int k = arr[l];
        int i = l+1 , j = h;
        while(true){
            while( i<=h && arr[i]<k){
                i++;
            }
            while(j >= l+1 && arr[j]>k){
                j--;
            }
            if(i>j){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        arr[l] = arr[j];
        arr[j] = k;
        return j;
    }
}
