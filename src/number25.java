package com.company;

public class number25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode pre = p;
        ListNode end = p;
        while(true){
            int count = 0;
            while(count != k && end!=null){
                count++;
                end = end.next;
            }
            if(end == null) break;
            ListNode next = pre.next;
            while(pre.next != end){
                ListNode t = pre.next;
                pre.next = t.next;
                t.next = end.next;
                end.next = t;
            }
            pre = next;
            end = next;
        }
        return p.next;
    }
}
