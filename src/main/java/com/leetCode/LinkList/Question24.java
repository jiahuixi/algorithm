package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 示例:
 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class Question24 {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(swapPairs(ListNode.initListNode(list1)));
    }
}
