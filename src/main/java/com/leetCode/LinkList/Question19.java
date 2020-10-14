package com.leetCode.LinkList;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 * 在真实的面试中遇到过这道题？
 */
public class Question19 {


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode demyHead = new ListNode(0);
        demyHead.next = head;
        ListNode fast = demyHead;
        ListNode low = demyHead;
        while(n > 0){
            if(fast == null){
                return null;
            }
            fast = fast.next;
            n --;
        }
        while(fast .next != null){
            fast = fast.next;
            low = low.next;
        }
        ListNode del = low.next;
        low.next = del.next;
        del.next =null;
        return demyHead.next;
    }

}
