package com.company;

public class number206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode m = slow.next;
        slow.next = null;
        ListNode l = reverseList(head);
        ListNode r = reverseList(m);
        m = r;
        while (r.next != null){
            r = r.next;
        }
        r.next = l;
        return m;
    }
}
