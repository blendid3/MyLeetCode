package com.example.MyLeetCode;
abstract class Test{

    void method() {
        System.out.println("test1");
    }
}

public class CountAndSay {

    static CountAndSay instance = new CountAndSay();
    public static CountAndSay getInstance() { return  instance;}

    public String countAndSay(int n) {
//        Test t1 = new Test() {};
        String str = "1";
        for (int i = 0; i < n - 1; i++) {
            str = iterateCount(str);
        }
        return str;
    }
    String iterateCount(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
//        if(str.length() == 1) return "11";
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count ++;
            } else {
                res.append((char)(count + '0')); res.append(str.charAt(i ));
                count = 1;
            }
        }
        res.append((char)(count +'0'));
        res.append(str.charAt(str.length() - 1) );
        return res.toString();
    }
    public static void main(String[] args) {
        CountAndSay.getInstance().getClass();
    }
}
