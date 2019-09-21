package com.company;

import java.util.ArrayList;
import java.util.List;

public class number102 {
    List<List<Integer>> res = new ArrayList<>();
    List<TreeNode> list = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return res;
        list.add(root);
        int c = 1;
        int cc = 0;
        int ite = 0;
        while(list.size() != 0){
            TreeNode t = list.get(0);
            ite ++;
            ans.add(t.val);
            if(t.left != null){
                list.add(t.left);
                cc++;
            }
            if(t.right != null){
                list.add(t.right);
                cc++;
            }
            if(ite == c){
                res.add(new ArrayList<>(ans));
                ans.clear();
                ite = 0;
                c = cc;
                cc = 0;
            }
            list.remove(0);
        }
        return res;
    }
}
