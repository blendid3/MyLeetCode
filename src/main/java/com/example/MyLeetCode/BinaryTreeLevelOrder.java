package com.example.MyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }

        List<TreeNode> cur = new ArrayList<>();

        cur.add(root);
        List<Integer>  tmpValue= new ArrayList<Integer>();
        tmpValue.add(root.val);

        while(cur.size() != 0) {
            res.add(tmpValue);
            List<TreeNode>tmp = new ArrayList<>();
            tmpValue = new ArrayList<>();
            for (int i = 0; i < cur.size(); i++) {
                TreeNode curNode = cur.get(i);
                if(curNode.left != null) {
                    tmp.add(curNode.left);
                    tmpValue.add(curNode.left.val);
                }

                if(curNode.right != null) {
                    tmp.add(curNode.right);
                    tmpValue.add(curNode.right.val);
                }

            }
            cur = tmp;
        }
        return  res;
    }
}
