package com.example.MyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<TreeNode> l1 = new ArrayList<>();
        recur(root, l1);
        for (int i = 1; i < l1.size(); i++) {
            if(l1.get(i - 1).val > l1.get(i).val) return false;
        }
        return true;
    }
    private void recur(TreeNode cur, List<TreeNode> res) {
        if(cur == null) return ;
        recur(cur.left, res);
        res.add(cur);
        recur(cur.right, res);
    }
}
