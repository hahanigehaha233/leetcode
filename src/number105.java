package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class number105 {
    public TreeNode backtrack(int[] preorder,int[] inorder){
        if(preorder.length == 0){
            return null;
        }else {
            TreeNode t = new TreeNode(preorder[0]);
            int i = 0;
            for (; i < inorder.length; ++i) {
                if (preorder[0] == inorder[i]) {
                    break;
                }
            }
            t.left = backtrack(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
            t.right = backtrack(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i+1, inorder.length));
            return t;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return backtrack(preorder,inorder);
    }
}
