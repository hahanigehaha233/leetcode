package com.company;

public class number86 {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode res = less;
        ListNode more = new ListNode(0);
        ListNode t = more;
        while(head != null){
            if(head.val < x){
                less.next = head;
                less = less.next;
            }else{
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }
        more.next = null;
        less.next = t.next;
        return res.next;
    }
}
