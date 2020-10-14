package com.leetCode.String;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxValue = 0;
        char[] chars = s.toCharArray();
        if(s.length()==0){
            return 0;
        }
        while (right <= chars.length) {
            String strTemp = s.substring(left, right);
            if (right < chars.length  && strTemp.contains(String.valueOf(s.charAt(right))) ) {
                left ++ ;
               // right = left;
            }else{
                right ++;
            }
            if(maxValue <= strTemp.length()){
                maxValue = strTemp.length();
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
