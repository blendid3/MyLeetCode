package com.example.MyLeetCode;

public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if(root.left == null && root.right == null ) return 1;
        if(root.left == null) return maxDepth(root.right);
        if(root.right == null) return maxDepth(root.left);
        return Integer.max(maxDepth(root.left ), maxDepth(root.right));

    }
}
