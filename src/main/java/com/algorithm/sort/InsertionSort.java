package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/5 13:55
 */
public class InsertionSort {
    public  static int []  insertionSort(int arr []){
        //遍历数组
        for(int i = 1 ; i<arr.length ; i++){
            //存储当前扫描到的值
            int e = arr [i] ;
            int j ;
            //向前遍历，如果之前的值比当前值大，向后移，挪出空位
            for( j = i ; j > 0 ; j -- ){
                if(arr[j-1] > e){
                    arr[j] = arr[j-1];
                }else{
                    break;
                }
            }
            //将空出的位置赋值为存储的e因为j--了所以没问题
            arr[j] = e;

        }
        return arr;
    }

}
