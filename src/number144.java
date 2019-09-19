package com.company;

import java.util.ArrayList;
import java.util.List;

public class number144 {
    List<Integer> res = new ArrayList<>();
    public void backtrack(TreeNode h){
        if(h == null) return;
        res.add(h.val);
        backtrack(h.left);
        backtrack(h.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        backtrack(root);
        return res;
    }
}
