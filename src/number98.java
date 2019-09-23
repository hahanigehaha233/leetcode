package com.company;

public class number98 {
    public boolean backtrack(TreeNode h ,Integer lower, Integer upper){
        if(h == null) return true;

        int val = h.val;
        if(lower != null && lower >= val) return false;
        if(upper != null && upper <= val) return false;

        if(!backtrack(h.right,val,upper)) return false;
        if(!backtrack(h.left,lower,val)) return false;

        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return backtrack(root,null,null);
    }
}
