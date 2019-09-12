package com.company;

public class number142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode low = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            low = low.next;
            if(low == fast){
                low = head;
                while(low != fast){
                    low = low.next;
                    fast = fast.next;
                }
                return low;
            }
        }
        return null;
    }
}
