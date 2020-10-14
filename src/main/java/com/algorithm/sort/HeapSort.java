package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/7 14:16
 */
public class HeapSort {

        public static int [] heapify(int [] arr,int tail){
            for (int i = tail; i >= 0; i --) {
                shiftDown(i,arr,tail);
            }
            return arr;
        }

        public static int [] heapSort(int arr[]){
            int tail = arr.length-1;
            int head = 0 ;
            while (tail > head){
                arr = heapify(arr,tail);
                swap(arr ,head,tail );
                tail --;
            }
            return arr ;
        }

        public static void swap(int arr[] , int i , int j ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

        }
        public static void shiftDown(int k,int arr[],int tail){
            while(getLeftChild(k) <= tail){
                int j = getLeftChild(k);
                if(j + 1 <= tail && arr[j+1] >arr [j] ){
                    j = getRightChild(k);
                }
                if(arr[k] >= arr[j]){
                    break;
                }
                swap(arr ,j,k );
                k = j;
            }
        }
        public static int getLeftChild(int index){
            return 2 * index + 1;
        }
        public static int getRightChild(int index){
            return 2 * index + 2 ;
        }
}
