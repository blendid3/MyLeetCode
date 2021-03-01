package com.example.LeetCodeContent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Items_Matching_a_Rule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        Map<String, Integer> mapType = new HashMap();
        Map<String, Integer> mapColor = new HashMap();
        Map<String, Integer> mapName = new HashMap();
        for (int i = 0; i < items.size(); i++) {
            List<String> sec = items.get(i);
            mapType.put(sec.get(0), mapType.getOrDefault(sec.get(0), 0) + 1);
            mapColor.put(sec.get(1), mapColor.getOrDefault(sec.get(1), 0) + 1);
            mapName.put(sec.get(2), mapName.getOrDefault(sec.get(2), 0) + 1);
        }
        if(ruleKey.equals("type") ) {
            return mapType.getOrDefault(ruleValue, 0);
        } else if(ruleKey.equals("color") ) {
            return mapColor.getOrDefault(ruleValue, 0);
        } else if(ruleKey.equals("name") ) {
            return mapName.getOrDefault(ruleValue, 0);
        }
        return 0;

    }
}
