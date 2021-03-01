package com.example.MyLeetCode;

public class LinkedListCycle { // 写的不好， 重写记得
    public boolean hasCycle(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        while(cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
            if(cur2 == null) return false;
            cur2 = cur2.next;
            if(cur2 == null) return false;

        }
        return true;
    }
}
