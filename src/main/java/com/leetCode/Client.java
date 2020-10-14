package com.leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author wenhe
 * @date 2020/8/15 12:49
 */
public class Client {
    static PriorityQueue<Integer>  p = new PriorityQueue<>(5, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    });
//    public static void main(String[] args) {
//
//
//        int nums []={-1, 0, 1, 2, -1, -4};
//        System.out.println(Solution.threeSum( nums));
//
//    }
    private static PriorityQueue addQueue(int value){
        if(p.size()<5){

            p.add(value) ;
        }else if(p.peek()< value){
            p.poll();
            p.add(value);
        }
        return p;
    }
}
