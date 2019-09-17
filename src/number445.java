package com.company;

public class number445 {
    public ListNode reverse(ListNode h){
        if(h == null || h.next == null) return h;
        ListNode ite = h;

        while(ite.next != null){
            ListNode n = ite.next;
            ite.next = n.next;
            n.next = h;
            h = n;
        }

        return h;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ite1 = l1;
        ListNode ite2 = l2;

        ListNode ite = null;
        ListNode res = null;
        int c = 0;
        while (ite1 != null || ite2 != null){
            int num1 = ite1 != null ? ite1.val:0;
            int num2 = ite2 != null ? ite2.val:0;

            int n = num1 + num2 + c;
            c = n / 10;

            ite = res;
            res = new ListNode(n % 10);
            res.next = ite;



            ite1 = ite1 != null ? ite1.next : null;
            ite2 = ite2 != null ? ite2.next : null;
        }

        if(c == 1){
            ite = res;
            res = new ListNode(1);
            res.next = ite;
        }
        return res;



    }
}
