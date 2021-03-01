package com.example.MyLeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambdaTest {
    interface Mylambda{
        void doSomething(String str);
//        void doSomething2(String str);

    }
    public void method1() {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1); l1.add(2);
        l1.forEach((n) -> System.out.println(n*2));
        Consumer<Integer> method2 = (n) -> System.out.println(n) ;// implement the Interface,
        Mylambda method3 = (n) -> System.out.println(n);
        method3.doSomething("haha");


    }
    Mylambda method7 = (s) -> System.out.println(s);
//    public static void main(String [] args) {
//        Test
//    }

}
