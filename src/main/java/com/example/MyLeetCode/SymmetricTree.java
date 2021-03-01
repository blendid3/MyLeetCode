package com.example.MyLeetCode;

import java.util.LinkedList;
import java.util.List;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        List<TreeNode> q1 = new LinkedList();
        q1.add(root);
        List<TreeNode> tmp ;
        while(!q1.isEmpty()){
            // check
            int left = 0; int right = q1.size() - 1;
            while(left < right) {
                if(q1.get(left) == null &&  q1.get(right) != null) {
                    return false;
                } else if(q1.get(left) != null &&  q1.get(right) == null){
                    return false;
                }
                else if(q1.get(left) == null &&  q1.get(right) == null) ;
                else if(q1.get(left).val != q1.get(right).val) {
                    return false;
                }
                left ++; right --;
            }
            // add the new level
            tmp = new LinkedList();
            for (int i = 0; i < q1.size(); i++) {
                if(q1.get(i) != null) {
                    tmp.add(q1.get(i).left); tmp.add(q1.get(i).right);
                }
            }
            q1 = tmp;
        }
        return true;
    }
}
