package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashSet;
import java.util.Map;

public class AixcoderOld90 extends GenerateMethodBase {
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
