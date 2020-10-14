package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * 示例:
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 */
public class Question86 {
    public static ListNode partition(ListNode head, int x) {

            return null;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5));
        System.out.println(partition(ListNode.initListNode(list1),5).toString());
    }
}
