package com.company;

public class number19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode t = new ListNode(0);
        t.next = head;
        ListNode r = t;
        while(n > 0){
            n--;
            r = r.next;
        }
        ListNode l = t;
        while(r.next != null){
            r = r.next;
            l = l.next;
        }
        l.next = l.next.next;
        return t.next;
    }
}
