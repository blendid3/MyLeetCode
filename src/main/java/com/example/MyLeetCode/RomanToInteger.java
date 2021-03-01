package com.example.MyLeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);map.put('V', 5);map.put('X', 10);map.put('L', 15);map.put('C', 100);map.put('D', 500);
        map.put('M', 1000);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1) {
                if(map.get(s.charAt(i)) > map.get(s.charAt(i + 1))) {
                    count += map.get(s.charAt(i));
                } else  {
                    count -= map.get(s.charAt(i));
                }
            } else {
                count += map.get(s.charAt(i));
            }
        }
        return count;
    }
    static boolean compare(char a, char b, Map map1) {
        if((int)map1.get(a) > (int)map1.get(b)) {
            return true;
        } else return false;
    }
}
