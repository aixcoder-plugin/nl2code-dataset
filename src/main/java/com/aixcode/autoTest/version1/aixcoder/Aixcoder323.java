package com.aixcode.autoTest.version1.aixcoder;

import java.util.HashSet;
import java.util.Map;

public class Aixcoder323 {
    public void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value) {
        if (map == null) {
            return;
        }

        if (!map.containsKey(key)) {
            map.put(key, new HashSet<>());
        }

        map.get(key).add(value);
    }
}
