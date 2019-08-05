package com.company;

import java.util.Collections;
import java.util.List;

public class number147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        while (cur.next != null){
            if(cur.next.val >= cur.val){
                cur = cur.next;
            }else{
                ListNode t = cur.next;
                cur.next = cur.next.next;
                ListNode h = dummy;
                while (h.next.val < t.val){
                    h = h.next;
                }
                t.next = h.next;
                h.next = t;
            }
        }
        return dummy.next;
    }
}
