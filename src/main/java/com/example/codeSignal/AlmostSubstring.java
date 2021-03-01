package com.example.codeSignal;

public class AlmostSubstring {
    int almostSubstring(String t, String s) {
//        if(t < )
        int len = t.length();
        int count = 0;
        for (int i = 0; i < len - 4; i++) {
            String str1 = t.substring(i, i + 1) + t.substring(i + 2, i + 3) + t.substring(i + 4, i + 5);
            if(str1.equals(s)) count ++;
        }
        return count;
    }

}
