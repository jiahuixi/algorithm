package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class Question61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        ListNode lent = head;
        int len = 0;
        while (lent != null) {
            lent = lent.next;
            len++;
        }
        int move = k % len;
        if (move == 0) {
            return head;
        }
        ListNode h1 = head;
        ListNode tail = head;
        while (move > 0) {
            tail = tail.next;
            move --;
        }
        while (tail.next != null) {
            tail = tail.next;
            head = head.next;
        }
        ListNode res = head.next;
        tail.next = h1;
        head.next = null;
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(rotateRight(ListNode.initListNode(list1), 2).toString());
    }
}
