package com.company;

public class number143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode fast = head;
        ListNode low = head;
        ListNode res = new ListNode(0);
        res.next = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            low = low.next;
        }
        ListNode pre = low;
        ListNode cur = low.next;
        while(cur.next != null){
            ListNode t = cur.next;
            cur.next = t.next;
            t.next = pre.next;
            pre.next = t;
        }

        ListNode p1 = head;
        ListNode p2 = low.next;
        while(p1 != low){
            low.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = low.next;
        }
    }
}
