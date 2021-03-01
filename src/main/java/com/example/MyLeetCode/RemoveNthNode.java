package com.example.MyLeetCode;

public class RemoveNthNode {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode  cur = head;
//        List<ListNode> l1 = new ArrayList<>();
//
//        while( cur != null) {
//            l1.add(cur);
//        }
//
//        int curIndex = l1.size() - n;
//        if(curIndex == 0) {
//            return head.next;
//        } else {
//            l1.get(curIndex - 1).next = l1.get(curIndex).next;
//            return head;
//        }
//    }
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int len = 0;
    ListNode first = head;
    while(first != null) {
        len++;
        first = first.next;
    }
    int index = len - n;
    first = dummy;
    while(index > 0) {
        index --;
        first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
}
}
