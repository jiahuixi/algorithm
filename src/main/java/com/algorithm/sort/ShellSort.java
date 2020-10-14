package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/5 16:39
 */
public class ShellSort {
    public static int [] shellSort(int arr []){
        int incrementNum = arr.length/2;
        while (incrementNum>=1){
            for (int i = 0; i <arr.length ; i++) {
                for(int j = i ; j < arr.length - incrementNum ; j = j + incrementNum){
                        if(arr[j]> arr[j+incrementNum] ){
                            int temp = arr[j];
                            arr[j] = arr[j + incrementNum];
                            arr[j + incrementNum] = temp;
                        }
                }
            }
            incrementNum = incrementNum/2;
        }
            return arr;
    }
}
