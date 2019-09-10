package com.company;

public class number82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = new ListNode(0);
        n.next = head;
        ListNode t = n;
        ListNode r = n;
        while(t.next != null && t.next.next != null){
            if(t.next.val == t.next.next.val){
                r = t.next;
                while(r != null && r.val == t.next.val){
                    r = r.next;
                }
                t.next = r;
                continue;
            }
            if(t.next != null)
                t = t.next;
        }
        return n.next;
    }
}
