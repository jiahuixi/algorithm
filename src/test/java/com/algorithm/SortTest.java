package com.algorithm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static com.algorithm.sort.HeapSort.heapSort;
import static com.algorithm.sort.MergeSort.mergeSort;

/**
 * @author jiahuixi
 * @date 2019/3/5 11:52
 */
public class SortTest {
    public  void  prinfArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1 && arr[i]>arr[i+1]){
                throw new IllegalArgumentException("排序失败了老哥");
            }else{
                System.out.print(arr[i]+"->");
            }
        }
        System.out.println("end");
        System.out.println(arr.length);
    }
        @Before
        public void before() throws Exception {
            System.out.println("测试开始");
        }
        @After
        public void after() throws Exception {
            System.out.println("测试结束-->");
        }
        @Test
        public void sortTest(){
            int arr[] = new int[10000];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(10000);
            }
            int arr2[] = Arrays.copyOf(arr,arr.length);
            //////////////////////////////////////////////
            long startTime1 = System.nanoTime();
            prinfArr(mergeSort(arr));
            long endTime1 = System.nanoTime();
            //////////////////////////////////////////////
            long startTime2 = System.nanoTime();
            prinfArr(heapSort(arr2));
            long endTime2 = System.nanoTime();
            //////////////////////////////////////////////
            System.out.println( (endTime1 - startTime1) / 1000000000.0);
            System.out.println( (endTime2 - startTime2) / 1000000000.0);
            //prinfArr(selectionSort(arr));0.001283997
        }
}
