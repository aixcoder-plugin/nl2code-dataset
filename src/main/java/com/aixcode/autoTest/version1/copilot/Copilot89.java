package com.aixcode.autoTest.version1.copilot;

import java.util.HashMap;
import java.util.Map;

public class Copilot89 {
    /**
     * 将map中所有的key转为大写
     */
    public static Map<String, Object> getAllUpperCase(Map<String, Object> map) {
        Map<String, Object> result = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            result.put(entry.getKey().toUpperCase(), entry.getValue());
        }
        return result;
    }
}
