package com.example.MyLeetCode;

public class ConvertSortedArray {
    public TreeNode sortedArrayToBST(int[] nums) {
        return  conquerAndDivider(nums, 0 , nums.length);
    }
    TreeNode conquerAndDivider(int[] nums, int beg, int end) {
        if(beg >= end ) return null;
        int mid =( end + beg ) / 2;
        TreeNode root = new TreeNode(mid);
        root.left = conquerAndDivider(nums, beg, mid);
        root.right = conquerAndDivider(nums, mid + 1, end);
        return  root;
    }
}
