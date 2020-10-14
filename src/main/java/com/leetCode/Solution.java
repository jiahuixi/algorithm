package com.leetCode;

import com.thread.blockqueue.BlockQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 示例 1:
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * <p>
 * 示例 2:
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 */


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int getData(int[] array) {
        int temp[] = new int[array.length];
        temp[array.length - 1] = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < temp[i + 1]) {
                temp[i] = array[i];
            } else {
                temp[i] = temp[i + 1];
            }
        }
        int left = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (left <= array[i]) {
                left = array[i];
                if (left == temp[i]) {
                    return left;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int a[] = {4, 5, 6, 7, 0, 1, 2};
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;

        l21.next = l22;
        l22.next = l23;
        ListNode ret = null;
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
        String s = "baa";
        String p = "aa";
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int array[] = {-1, 0, 1, 2, -1, -4};
        List<Integer> queue = new ArrayList<>();
        BlockQueue q = new BlockQueue(queue, 5);
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    for (int i = 0; i < 5; i++) {
                        q.push(i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println(q.poll());
            }

        }).start();
    }

}