package com.company;

public class number124 {
    int max = Integer.MIN_VALUE;
    public int backtrack(int now,TreeNode h){
        if(h == null) return 0;
        int l = backtrack(now,h.left);
        l = Math.max(l, 0);
        int r = backtrack(now,h.right);
        r = Math.max(r, 0);
        max = Math.max(max,h.val);
        max = Math.max(max,l+r+h.val);
        return Math.max(Math.max(l, r) + h.val, h.val);
    }
    public int maxPathSum(TreeNode root) {
        backtrack(0,root);
        return max;
    }
}
