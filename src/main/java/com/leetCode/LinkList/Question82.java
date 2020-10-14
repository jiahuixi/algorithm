package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 * <p>
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 */
public class Question82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode before = dummyhead;
        ListNode cur = dummyhead.next;
        while (cur != null && cur.next != null) {
//            System.out.println(cur);
            if (cur.val == cur.next.val) {
                ListNode delEnd = cur.next;
                while (delEnd.next != null) {
                    if (delEnd.val == delEnd.next.val) {
                        delEnd = delEnd.next;
                    }else{
                        break;
                    }
                }
                before.next = delEnd.next;
                delEnd.next = null;
                cur = before.next;
            }else{
                before = before.next;
                cur = before.next;
            }
            if (before == null) {
                break;
            }
//            System.out.println( dummyhead.next);
        }
        return dummyhead.next;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 4, 5));
        System.out.println(deleteDuplicates(ListNode.initListNode(list1)).toString());
    }
}
