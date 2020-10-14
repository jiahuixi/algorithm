package com.algorithm.newSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wenhe
 * @date 2020/7/18 15:20
 */
public class TongPai {
    public static int[] tongpai(int array[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
        }
        int tongSize = (max - min) / array.length + 1;
        ArrayList<ArrayList<Integer>> tong = new ArrayList<>(tongSize);
        for (int i = 0; i <tong.size() ; i++) {
            tong.add(new ArrayList<>());
        }
        for (int i = 0; i < array.length; i++) {
            int num = (array[i]-min)/array.length;
            tong.get(num).add(array[i]);
        }
        for (int i = 0; i < tong.size(); i++) {
            Collections.sort(tong.get(i));
        }
        int ret [] = new int[array.length];
        for (int i = 0; i <tong.size(); i++) {
            for (int j = 0; j <tong.get(i).size() ; j++) {
                ret[j++] = tong.get(i).get(j);
            }
        }
        return ret;
    }
}
