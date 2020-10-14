package com.huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author wenhe
 * @date 2020/9/23 13:48
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            int n=in.nextInt();
            if(n>0){
                TreeSet<Integer> set = new TreeSet<>();
                for (int i = 0; i < n; i++) {
                    set.add(in.nextInt());
                }
                set.forEach(System.out::println);
            }
        }
    }
}
