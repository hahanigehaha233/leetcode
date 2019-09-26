package com.company;

public class number116 {
    public Node connect(Node root) {
        if(root == null) return root;
        Node left = root.left;
        Node right = root.right;
        while(left != null){
            left.next = right;

            left = left.right;
            right = right.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
