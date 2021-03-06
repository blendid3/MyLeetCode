package com.example.MyLeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class test {

    public static void main(String[] args) {
        validParentheses("([)]");
    }

    static String validParentheses(String words) {
        Stack<Character> s1 = new Stack<>();
        Map<Character, Character> map1 = new HashMap(){{
            put('{', '}');
            put('[', ']');
            put('(', ')');

        }};
        for (int i = 0; i < words.length(); i++) {

            if (s1.empty()) {
                if (!map1.containsKey(words.charAt(i)))
                    return "False";
                s1.add(words.charAt(i));
                continue;
            }
            if (map1.get(s1.peek()) == words.charAt(i)) {
                s1.pop();
            }  else {
                s1.add(words.charAt(i));
            }
        }
        return s1.empty() ? "True": "False";
    }
}
