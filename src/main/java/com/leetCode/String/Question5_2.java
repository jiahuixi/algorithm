package com.leetCode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 */
public class Question5_2 {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append("#").append(s.charAt(i));
        }
        sb.append("#");
        s = sb.toString();
        char charsTemp[] = s.toCharArray();
        int key = 0, maxlength = 0;
        String ret = "";
        while (key < s.length()) {
            int left = key;
            int right = key;
            while (left >= 0 && right < s.length() && charsTemp[left] == charsTemp[right]) {
                int size = s.substring(left, right + 1).length();
                if (maxlength < size) {
                    ret = s.substring(left, right + 1);
                    maxlength = size;
                }
                left--;
                right++;
            }
            key++;
        }
        return ret.replace("#", "");
    }


    public static void main(String[] args) {
        String s = "";
        System.out.println(longestPalindrome(s));
    }

    /**
     * @author zhangrichao
     * @version 创建时间：2019年1月9日 下午6:55:30
     * 求两个字符串的最长公共子串
     */
    static class CommonString {
        public static String cs(String str1, String str2) {
            //变成字符串数组str11
            String[] str11 = str1.split("");
            //变成字符串数组str22
            List<String> list = new ArrayList<>();
            String[] str22 = str2.split("");
            //构造一个record数组
            int[][] record = new int[str11.length][str22.length];
            int maxLen = 0, maxEnd = 0;
            //循环遍历两个数组
            for (int i = 0; i < str11.length; i++) {
                for (int j = 0; j < str22.length; j++) {
                    if (str11[i].equals(str22[j])) {
                        //最顶边和最左边设为1
                        if (i == 0 || j == 0) {
                            record[i][j] = 1;
                        }
                        //对角线设成+1的形式
                        else {
                            record[i][j] = record[i - 1][j - 1] + 1;
                        }
                    } else { //如果两个数不等的话设置为0
                        record[i][j] = 0;
                    }
                    //如果数组大于最大长度，则将其赋给maxLen
                    if (record[i][j] > maxLen) {
                        maxLen = record[i][j];
                        maxEnd = j; //若记录i,则最后获取LCS时是取str1的子串
                    }
                }
            }
            for (String s : list) {
                System.out.println(s + "-------");
            }
            return str1.substring(maxEnd - maxLen + 1, maxEnd + 1);
        }

        public static void main(String[] args) {
            String s1 = "caba";
            String s2 = "bab";
            String s = cs(s1, s2);
            System.out.println(s);
        }


    }
}
