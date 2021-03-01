package com.example.Exception;

import java.io.IOException;

class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}


class Testthrows3{
    public static void main(String args[]) throws  IOException {//declare exception
//        throw new Exception("Error");
        M m=new M();
        m.method();

        System.out.println("normal flow...");
    }
}