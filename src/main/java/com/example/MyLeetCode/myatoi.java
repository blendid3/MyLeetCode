package com.example.MyLeetCode;

public class myatoi {

    public int myAtoi(String s) {
        StringBuilder str = new StringBuilder();
        boolean flag = true;
        boolean startFalg = false;
        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(letter == ' ' && startFalg == false) {
                continue;
            } else if(letter == '-'  && startFalg == false ) {
                flag = false;
                startFalg = true;
            } else if(letter == '+' && startFalg == false) startFalg = true;
            else if(letter >= '0' && letter <= '9' ) {
                str.append(letter);
                startFalg = true;
            } else break;
        }
        if(str.length() == 0) {
            return 0;
        }
        long res = 0;
        for(char val : str.toString().toCharArray()) {
            res = res * 10 + (val - '0');
            if(res > Integer.MAX_VALUE && flag) {
                return Integer.MAX_VALUE;
            } else if (res - 1 > Integer.MAX_VALUE && flag == false )
                return Integer.MIN_VALUE;
        }
        return (int) (res * (flag ? 1: -1));
    }
}
