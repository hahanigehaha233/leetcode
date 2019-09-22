package com.company;

public class number112 {
    public boolean backtrack(int sum,int now,TreeNode h){
        if(h == null) return false;
        if(h.right == null && h.left == null){
            return now + h.val == sum;
        }else{
            return backtrack(sum ,now + h.val,h.left) || backtrack(sum ,now + h.val,h.right);
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        return backtrack(sum,0,root);
    }
}
