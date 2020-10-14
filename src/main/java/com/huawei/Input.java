package com.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author wenhe
 * @date 2020/9/23 13:50
 */
public class Input {
    public static void main(String[] args) {
        /**
         * 1
         * 2
         * 3
         * 4
         * 5
         */
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
        // 5 4 3
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            int m = reader.nextInt();
            int n = reader.nextInt();
        }
        //asdffgbvdfh4r
        BufferedReader br=new BufferedReader(new InputStreamReader( System.in));
        String str = null;
        while(true){
            try {
                if (!((str=br.readLine())!=null)) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            char []chs=str.toCharArray();
        }
    }
}
