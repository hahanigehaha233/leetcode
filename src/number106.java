package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class number106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0) return null;
        else{
            TreeNode t = new TreeNode(postorder[postorder.length - 1]);
            int i = 0;
            for(;i < inorder.length;++i){
                if(inorder[i] == postorder[postorder.length - 1]) break;
            }
            t.left = buildTree(Arrays.copyOfRange(inorder,0,i), Arrays.copyOfRange(postorder,0,i));
            t.right = buildTree(Arrays.copyOfRange(inorder,i+1,inorder.length),Arrays.copyOfRange(postorder,i,postorder.length - 1));
            return t;
        }
    }
}
