import java.util.Arrays;

public class number23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int out = lists.length;
        ListNode res = new ListNode(0);
        ListNode t = res;
        while (out > 0){
            int val = Integer.MAX_VALUE;
            int mark =0;
            for(int i = 0;i < lists.length;++i){
                if(lists[i] != null) {
                    if (val > lists[i].val) {
                        val = lists[i].val;
                        mark = i;
                    }
                }
            }
            if(lists[mark] != null) {
                res.next = lists[mark];
                res = res.next;
                lists[mark] = lists[mark].next;
            }
            if(lists[mark] == null){
                out--;
            }
        }
        return t.next;
    }
}
