package com.leetCode.LinkList;

import java.util.List;

/**
 * @author wenhe
 * @date 2019/11/7 15:36
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode initListNode(List<Integer> x) {
        ListNode dummyHead = new ListNode(0);
        ListNode ret = dummyHead;
        for (int i = 0; i < x.size(); i++) {
            ret.next = new ListNode(x.get(i));
            ret = ret.next;
        }
        return dummyHead.next;
    }

    @Override
    public String toString() {
        if(this!=null){
            return " --> " + val + next ;
        }else{
            return null;
        }

    }
}
