package com.example.BackTrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class PalindromePermutation2 {
    public List<String> generatePalindromes(String s) {
        Map<Character, Integer> map1 = new HashMap<>();
        List<String> res = new ArrayList<>();

        s.chars().forEach(item -> {map1.put((char) item, map1.getOrDefault((char)item, 0) + 1); });
        AtomicBoolean isPali = new AtomicBoolean(true);

        AtomicReference<Character> oddChar = new AtomicReference<>((char) 0);
        if (s.length() % 2 == 0) {
            map1.entrySet().stream().forEach(item -> {
                if (item.getValue() % 2 != 0)
                    isPali.set(false);});
        } else {
            AtomicBoolean hasOdd = new AtomicBoolean(false);
            map1.entrySet().stream().forEach(item -> {
                if (item.getValue() % 2 != 0 && !hasOdd.get()){
                    oddChar.set(item.getKey());
                    hasOdd.set(true);
                } else if (item.getValue() % 2 != 0 && hasOdd.get())
                    isPali.set(false);
            });

            char item = oddChar.get();
            map1.put((char) item, map1.getOrDefault(item, 1) - 1);
        }
        if (!isPali.get()) return new ArrayList<>();

        backTrack(map1, res, new StringBuilder(), s.length() / 2, s.length() % 2 != 0, oddChar.get());
        return  res;

    }

    public void backTrack(Map<Character, Integer> map1, List<String> res, StringBuilder curList, int size, boolean isodd, char oddValue ) {
        if (size == curList.length()) {
            res.add(duplicate(isodd, oddValue, curList.toString()));
        }
//        if(size > )
        for (Map.Entry<Character, Integer> entry: map1.entrySet()) {
            if(entry.getValue() > 0) {
                curList.append(entry.getKey());
                map1.put(entry.getKey(), entry.getValue() - 2);
                backTrack(map1, res, curList, size, isodd, oddValue);
                curList.deleteCharAt(curList.length() - 1);
                map1.put(entry.getKey(), entry.getValue() + 2);
            }
        }
    }
    String duplicate(boolean isodd, char oddValue, String str1) {
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.reverse();
//        builder.append()
        if (isodd) {
            builder.insert(0, oddValue);
        }
        builder.insert(0, str1);
        return builder.toString();

    }
    public static PalindromePermutation2 createPali() {
        return new PalindromePermutation2();
    }
}
