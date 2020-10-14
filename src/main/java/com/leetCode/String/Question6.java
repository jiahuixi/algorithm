package com.leetCode.String;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 */
public class Question6 {
    public static String convert(String s, int numRows) {

        String[] chars = s.split("");
        String arr [][] = new String [numRows][s.length()];
        int x = 0  ;
        int y = 0;
        boolean flag = false;
        if(s.length() ==0 || numRows ==1){
            return s;
        }
        for(int i = 0 ; i < chars.length ;i ++){
            if(x == numRows-1){
                flag = true;
            }
//            System.out.println("x"+x+"--y"+y+"chars[i]"+chars[i]);
            arr[x][y] = chars[i];
            if(flag && x > 0){
                x --;
                y ++;
            } else{
                x ++ ;
                flag =false;
            }

        }
        String ret = arrToString(arr);
        return ret;
    }

    public static String arrToString(String arr[][]){
        //控制行数
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<arr.length;m++){
            for(int n=0;n<arr[m].length;n++){
                //一行中有多少个元素（即多少列）
                if(arr[m][n]!=null && !("").equals(arr[m][n])){
                    sb.append(arr[m][n]);
                }
               // System.out.print(arr[m][n]);
            }
           // System.out.println();
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String str = "LEETCODEISHIRING";
        int rowNum = 3;
        System.out.println(convert(str,rowNum));
    }
}
