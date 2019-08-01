package com.company;

public class number148 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(tmp);
        ListNode h = new ListNode(0);
        ListNode res = h;
        while (l != null && r != null){
            if( l.val > r.val){
                h.next = r;
                r = r.next;
            }
            else{
                h.next = l;
                l = l.next;
            }
            h = h.next;
        }
        h.next = l != null ? l : r;
        return res.next;
    }
}
