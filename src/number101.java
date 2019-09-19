package com.company;

public class number101 {
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        TreeNode right = invertTree(root.right);
        return isSameTree(root.left,right);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null) return true;
        else if(p == null || q == null){
            return false;
        }else{
            if(p.val != q.val) return false;
            boolean l = isSameTree(p.left,q.left);
            boolean r = isSameTree(p.right,q.right);
            if(l == true && r == true) return true;
            else return false;
        }
    }
}
