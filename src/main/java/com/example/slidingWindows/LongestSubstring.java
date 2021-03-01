package com.example.slidingWindows;

import java.util.Collections;
import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        // store the char and rightmost index
        HashMap<Character, Integer> map1 = new HashMap();

        int left =  -1;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), i);
            if(map1.size() == 3) {
                int index = Collections.min(map1.values());
                map1.remove(s.charAt(index));
                left = index ;
            }
            res = i - left > res ? i - left: res;
        }
        return res;
    }
}
