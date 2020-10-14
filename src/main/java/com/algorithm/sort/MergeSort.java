package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/6 15:12
 */
public class MergeSort {
    public static int [] mergeSort(int arr[],int low , int high){
            int mid = (low + high) / 2;
            if(low < high){
                mergeSort( arr, low, mid );
                mergeSort( arr,mid + 1 , high );
                merge(arr, low ,mid, high);
            }
            return arr;
    }
    public static void merge(int arr[],int low,int mid , int high){
            int arrTemp[] = new int [high-low+1];
            int i = low;
            int j = mid+1;
            int k = 0 ;
            while(i <= mid && j <= high){
                if(arr[i] < arr[j]){
                    arrTemp[k++] = arr [i++];
                }else {
                    arrTemp[k ++] = arr[j ++];
                }
            }
            while (i <= mid){
                arrTemp[k++] = arr[i++];
            }
            while(j <= high){
                arrTemp[k++] = arr[j++];
            }
            for(int x = 0 ; x < arrTemp.length ; x ++){
                arr[low + x] = arrTemp[x];
            }
    }
    public static int[] buttomToUpmergeSort2(int[] arr) {
        //每次size增加一倍所以size= size*2
        for (int size = 1; size < arr.length; size=size*2) {
            /**
             * low = j ;
             * high = j + 2 * size - 1;//因为需要两个子串进行比较
             * mid = (low + high) /2 并向下取整 = j + size -1
             */
            for(int j=0;j < arr.length-size;j=j+2 * size){
                merge(arr, j, j+size-1, Math.min(j+2*size-1, arr.length-1));
            }
        }
        return arr;
    }
    public static int [] mergeSort(int arr[]){

        return mergeSort(arr,0,arr.length-1);
    }
}
