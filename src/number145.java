package com.company;

import java.util.ArrayList;
import java.util.List;

public class number145 {
    List<Integer> res = new ArrayList<>();
    public void backtrack(TreeNode h){
        if(h == null) return;
        backtrack(h.left);
        backtrack(h.right);
        res.add(h.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        backtrack(root);
        return res;
    }
}
