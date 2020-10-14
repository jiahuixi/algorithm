package com.algorithm;

import com.algorithm.newSort.GuiBing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;


/**
 * @author jiahuixi
 * @date 2019/3/5 11:52
 */
public class NewSortTest {
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
            int arr[] = new int[100];
//            int arr[] = {4,5,1,7,6};
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
            int arr2[] = Arrays.copyOf(arr,arr.length);
            //////////////////////////////////////////////
            long startTime1 = System.nanoTime();
            prinfArr(GuiBing.guibing(arr));
            long endTime1 = System.nanoTime();
            //////////////////////////////////////////////
            long startTime2 = System.nanoTime();
           // prinfArr(MaoPao(arr2));
            long endTime2 = System.nanoTime();
            //////////////////////////////////////////////
            System.out.println( (endTime1 - startTime1) / 1000000000.0);
            System.out.println( (endTime2 - startTime2) / 1000000000.0);
            //prinfArr(selectionSort(arr));0.001283997
        }
}
