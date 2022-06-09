package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashSet;
import java.util.Map;

public class AixcoderAuto90 extends GenerateMethodBase {
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
