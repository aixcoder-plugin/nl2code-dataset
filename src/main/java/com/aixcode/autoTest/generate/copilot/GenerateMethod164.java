package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenerateMethod164 extends GenerateMethodBase {
    /**
     * Reverse a Map into a ValueSetMap, where each original value is mapped to the set of all its original keys.
     */
    public <K, V> Map<V, Set<K>> reverseMapIntoValueSetMap(Map<K, V> map) {
        Map<V, Set<K> > result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            Set<K> keys = result.get(value);
            if (keys == null) {
                keys = new HashSet<>();
                result.put(value, keys);
            }
            keys.add(entry.getKey());
        }
        return result;
    }




}
