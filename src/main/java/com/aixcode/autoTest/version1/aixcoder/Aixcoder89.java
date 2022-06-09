package com.aixcode.autoTest.version1.aixcoder;

import java.util.HashMap;
import java.util.Map;

public class Aixcoder89 {
    /**
     * 将map中所有的key转为大写
     */
    public static Map<String, Object> getAllUpperCase(Map<String, Object> map) {
        if (map == null) {
            return null;
        }

        Map<String, Object> tempMap = new HashMap<>();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey().toUpperCase();
            tempMap.put(key, entry.getValue());
        }

        return tempMap;
    }
}
