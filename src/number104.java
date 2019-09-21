package com.company;

public class number104 {
    public int backtrack(int max,int now,TreeNode h){
        if(h == null){
            return now;
        }else{
            int l = backtrack(max,now+1,h.left);
            int r = backtrack(max,now+1,h.right);
            return l>r?l:r;
        }
    }
    public int maxDepth(TreeNode root) {
        return backtrack(0,0,root);
    }
}
