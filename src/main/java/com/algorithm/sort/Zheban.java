package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/15 11:34
 */
public class Zheban {

    public static int  zheBan(int arr[] , int k){
       int  l = 0;
       int  h = arr.length-1;

       while(l <= h){
           int mid = l + (h-l)/2;
           if(k == arr [mid]){
               return mid;
           }else if(k > arr[mid]){
               l = mid +1 ;
           }else if( k < arr[mid]){
               h = mid -1;
           }
       }
       return -1;
    }
    public static int  zheBan2(int arr[] , int k ,int l, int h ){
        int mid;
        if(l<h){
             mid = l + (h-l)/2;
            if(k == arr [mid]){
                return mid;
            }else if(k > arr[mid]){
                return zheBan2(arr,k,mid+1 , h);
            }else {
                return zheBan2(arr,k,l , mid-1);
            }
        }else{
            return -1;
        }
    }
    public static int zheban3(int[] array, int k){
        int s = 0 ;
        int e = array.length -1;
        while(s <=e ){
            int  mid  = s + (s-e)/2;
            if(k == mid){
                return  mid;
            } else if(k > mid){
                s = mid-1;
            }else{
                e = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(zheban3(arr,1));
    }
}
