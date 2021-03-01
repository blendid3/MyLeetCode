package com.example.MyLeetCode;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        String max; String min;
        if (x > y) {
            max = Integer.toBinaryString(x);
            min = Integer.toBinaryString(y);
        } else {
            min = Integer.toBinaryString(x);
            max = Integer.toBinaryString(y);
        }

        int count = 0;
        for (int i = 0; i < max.length() - min.length(); i++) {
            if(max.charAt(i) == '1') count ++;
        }
        for (int i = max.length() - min.length(); i < max.length(); i++) {
            if(max.charAt(i) != min.charAt(i - (max.length() - min.length())) ) count ++;
        }
        return count;
    }
}
