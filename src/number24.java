package com.company;

public class number24 {
    public ListNode swapPairs(ListNode head) {
        ListNode n = new ListNode(0);
        n.next = head;
        ListNode t = n;


        while(t.next != null && t.next.next != null){
            ListNode r = t.next.next;
            ListNode l = t.next;

            l.next = r.next;
            t.next = r;
            r.next = l;

            t = t.next.next;

        }

        return n.next;
    }
}
