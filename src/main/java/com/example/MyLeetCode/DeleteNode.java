package com.example.MyLeetCode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }

}

interface Test3{};

class Test2 {
    public static void main(String[] args) {
        new DeleteNode() {
            @Override
            public void deleteNode(ListNode node){

            }
        };
        A a = new B();
        a.show();
    }
}

class A{
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    //子类B重写了父类A的show方法
    public void show(){
        System.out.println("B");
    }
}