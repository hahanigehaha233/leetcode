package com.company;

public class numner121 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            low = low.next;
            if(low == fast) return true;
        }
        return false;
    }
}
