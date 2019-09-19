package com.company;

public class number100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q == null && p == null) return true;
        else if(p == null || q == null){
            return false;
        }else{
            if(p.val != q.val) return false;
            boolean l = isSameTree(p.left,q.left);
            boolean r = isSameTree(p.right,q.right);
            if(l && r) return true;
            else return false;
        }
    }
}
