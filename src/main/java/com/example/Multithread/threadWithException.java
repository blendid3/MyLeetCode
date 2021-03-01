package com.example.Multithread;

import java.io.IOException;

public class threadWithException extends Thread{
    int val = 0;
    public void method1() throws Exception {
        val ++;
        System.out.println(this.getName() + ": method1 start works;");
        throw new IOException(this.getName() + ": throw IO Exception;");


    }
    public void run() {
//        this.
//        Thread.currentThread().join();
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]){

        threadWithException t1=new threadWithException();
//        t1.current
        try {
            t1.start();
//            Timer timer = new Timer();
            Thread.sleep(1000);
            System.out.println(t1.val);
        } catch (Exception e) {
        }

    }
}
