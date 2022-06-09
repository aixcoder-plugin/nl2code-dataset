package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AixcoderNew90 extends GenerateMethodBase {
    public void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value) {
        if (map == null) {
            map = new HashMap<String, HashSet<Integer>>();
        }
        HashSet<Integer> set = map.get(key);
        if (set == null) {
            set = new HashSet<Integer>();
            map.put(key, set);
        }
        set.add(value);
    }
}
