package com.company;

import java.util.ArrayList;
import java.util.List;

public class number94 {
    List<Integer> res = new ArrayList<>();
    public void backtrack(TreeNode h){
        if(h == null) return;
        backtrack(h.left);
        res.add(h.val);
        backtrack(h.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        backtrack(root);
        return res;
    }
}
