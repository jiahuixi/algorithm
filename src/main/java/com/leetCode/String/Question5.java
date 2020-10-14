package com.leetCode.String;

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
public class Question5 {
    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxValue = 0;
        String ret = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String tempStr = s.substring(i, j);
                if (isHuiwen(tempStr) && tempStr.length() > maxValue) {
                    ret = tempStr;
                    maxValue = tempStr.length();
                }
            }
        }
        return ret;
    }

    public static boolean isHuiwen(String s) {
        StringBuffer sb = new StringBuffer(s);
        String sbr = sb.reverse().toString();
        if (s.equals(sbr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
