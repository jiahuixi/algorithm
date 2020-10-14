package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/5 10:48
 */
public class SelectionSort {
    public static int [] selectionSort(int arr []){
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            // 寻找[i, arr.length)区间里的最小值
            for(int j = i + 1 ; j < arr.length; j ++){
                if( arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            //交换位置
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] =  arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {


    }
}
