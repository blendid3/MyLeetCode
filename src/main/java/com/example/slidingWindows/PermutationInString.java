package com.example.slidingWindows;

import java.util.HashMap;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        //
        if (s1.length() > s2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map2.put(s2.charAt(i), i);

        }
        int left = 0;
        for (int i = s1.length(); i < s2.length() ; i++) {
            if(map1.equals(map2)) {
                return true;
            }

            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
            map2.put(s2.charAt(left), map2.getOrDefault(s2.charAt(left), 0) - 1);
            if(map2.get(s2.charAt(left)) == 0)
                map2.remove(s2.charAt(left));
            left ++;
        }
        return false;

    }
}
