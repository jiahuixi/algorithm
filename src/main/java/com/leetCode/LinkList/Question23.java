package com.leetCode.LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 */
public class Question23 {
    public static ListNode mergeKLists(ListNode[] lists) {



return null;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(-9,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5,7));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(5,7));
        ListNode ln1 = ListNode.initListNode(list1);
        ListNode ln2 = ListNode.initListNode(list2);
        ListNode ln3 = ListNode.initListNode(list3);
        System.out.println(mergeKLists(new ListNode[]{ln1,ln2,ln3}).toString());
    }
}