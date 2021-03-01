package com.example.MyLeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> map1 = new HashMap<>();
        map1.put(')', '(' ); map1.put(']', '[' ); map1.put('{', '}');
        Stack<Character> s1 = new Stack<Character>();
//        Iterator t1 = s1.iterator();
        for (char val: s.toCharArray()) {
//            char val = (Character) t1.next();

            if (s1.empty()) {
                if (!map1.containsKey(val)) return  false;
                s1.add(val);
            } else {
                if (!map1.containsKey(val)) return  false;
                if(s1.peek() == map1.get(val)) {
                    s1.pop();
                } else {
                    s1.add(val);
                }
            }
        }
        return s1.empty();

    }
}
