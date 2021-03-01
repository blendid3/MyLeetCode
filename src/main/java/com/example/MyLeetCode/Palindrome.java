package com.example.MyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode cur = head;
        List<ListNode> l1 = new ArrayList<>();
        while(cur != null) {
            l1.add(cur);
            cur = cur.next;
        }
        int left = 0; int right = l1.size() - 1;
        while(right > left) {
            if(l1.get(right).val != l1.get(left).val) {
                return false;
            }
            right --; left ++;
        }
        return true;
    }
}
