package com.aixcode.autoTest.version1.copilot;

import java.util.HashSet;
import java.util.Map;

public class Copilot323 {
    /**
     * Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
     */
    public void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value) {
        HashSet<Integer> set = map.get(key);
        if (set == null) {
            set = new HashSet<>();
            map.put(key, set);
        }
        set.add(value);
    }
}
