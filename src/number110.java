package com.company;

public class number110 {
    public int backtrack(TreeNode h){
        if(h == null) return 0;
        int l = backtrack(h.left);
        if(l == -1) return -1;
        int r = backtrack(h.right);
        if(r == -1) return -1;
        return Math.abs(l - r) < 2 ? Math.max(l,r) + 1 : -1;
    }
    public boolean isBalanced(TreeNode root) {
        return backtrack(root) != -1;
    }
}
