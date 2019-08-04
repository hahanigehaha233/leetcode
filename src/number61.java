public class number61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode h = head;
        while (h.next != null){
            len ++;
            h = h.next;
        }
        ListNode tail = h;
        int t = k % len;
        if (t == 0) return head;
        h = head;
        len = len - t;
        while (len > 1){
            h = h.next;
            len --;
        }
        ListNode res = h.next;
        h.next = null;
        tail.next = head;
        return res;
    }
}
