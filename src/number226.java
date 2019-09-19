package com.company;

public class number226 {
    public void backtrack(TreeNode h){
        if(h == null) return;
        backtrack(h.left);
        backtrack(h.right);
        TreeNode t = h.right;
        h.right = h.left;
        h.left = t;
    }
    public TreeNode invertTree(TreeNode root) {
        backtrack(root);
        return root;
    }
}
