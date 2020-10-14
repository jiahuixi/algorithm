package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class Question21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode demNode = new ListNode(0);
        ListNode ret = demNode;
        while(l1 != null && l2 != null){
            int num1 = l1.val ;
            int num2 = l2.val;
            if(num1 < num2){
                ret.next = l1;
                l1 = l1.next;
            }
            if(num1 >= num2){
                ret.next = l2;
                l2 = l2.next;
            }
            ret = ret.next;
        }
        while(l1 != null){
            ret.next = l1;
            l1 = l1.next;
            ret = ret.next;
        }
        while(l2 != null){
            ret.next = l2;
            l2 = l2.next;
            ret = ret.next;
        }
        return demNode.next;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-9,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5,7));
        System.out.println(mergeTwoLists( ListNode.initListNode(list1),  ListNode.initListNode(list2)).toString());;
    }
}
