package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/7 10:54
 */
public class QuickSort {
    public static int [] quickSort(int arr[]){
        //返回排序后的结果
         quickSort(arr,0,arr.length-1);
         return arr;
    }

    public static void  quickSort(int arr[] ,int l,int r){
        //只有一个元素时候递归结束条件
        if(l >= r ){
            return ;
        }
        //取第一个值为key进行分组
        int p = partition(arr,l,r);
        //递归对左右进行排序
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private static int partition(int arr[], int left, int right) {
        int k = arr[left];
        int i = left +1;
        int j = right ;
        while (true){
            //如果左指针的值比k的值小的话继续向后扫描s
            while( i <= right && arr[i] < k ){
                i ++;
            }
            //如果右指针的值比k的值大的话继续向后扫描
            while(j >= left + 1 &&  arr[j] > k ){
                j --;
            }
            //如果两个指针错位的话结束循环
            if(j < i){
                break;
            }
            //左右指针遇到的比k大和小的元素进行交换
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            //交换后左右指针扫描下一个元素
            j--;
            i++;
        }
        //指针交错后j指向的元素较小，所以替换left和j的元素
        //如果替换i的元素会导致左侧的元素存在比k大的元素
        arr [left] = arr[j] ;
        arr[j] = k;
        return j ;
    }
}
