package com.example.MyLeetCode;

import java.util.PriorityQueue;

public class MinStack {
    PriorityQueue q1 = new PriorityQueue();
    public MinStack() {

    }

    public void push(int x) {
        q1.add(x);
    }

    public void pop() {
        q1.poll();


    }

    public int top() {
//        q1.stream().collect()
       return (int)q1.stream().toArray()[q1.size() - 1];
    }

    public int getMin() {
        return (int)q1.peek();
    }
}
