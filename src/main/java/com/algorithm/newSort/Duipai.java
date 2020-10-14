package com.algorithm.newSort;

/**
 * @author wenhe
 * @date 2020/7/18 15:29
 */
public  class Duipai {
    public static int[]  heapify(int[] arr, int tail) {
        for (int i = (tail-1)/2; i >= 0; i--) {
            shiftDown(arr, i, tail);
        }
        return arr;
    }
    public static int[] duipai(int[] array) {
        int tail = array.length - 1;
        int head = 0;
        while (tail > head) {
            array = heapify(array, tail);
            swap(array, head, tail);
            tail--;
        }
        return array;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static int getLeftChild(int index) {
        return 2 * index + 1;
    }

    public static int getRightChild(int index) {
        return 2 * index + 2;
    }

    public static int getParent(int index) {
        return (index - 1) / 2;
    }

    public static void shiftDown(int array[], int index, int tail) {
        while (getLeftChild(index) <= tail) {
            int j = getLeftChild(index);
            if (j + 1 <= tail && array[j + 1] > array[j]) {
                j = getRightChild(index);
            }
            if (array[index] >= array[j]) {
                break;
            }
            swap(array ,j,index );
            index = j;
        }

    }
}

