package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/5 14:47
 */
public class BubbleSort {
    public static int [] bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i ++) {
            boolean flag = true;
            //最大的已经在上面了 所以-i不用比较了减1防止数组越界
            for (int j = 0; j < arr.length-1; j ++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    flag = false;
                }
            }
            if(flag == true){
                return arr;
            }
        }
        return arr;
    }

}
