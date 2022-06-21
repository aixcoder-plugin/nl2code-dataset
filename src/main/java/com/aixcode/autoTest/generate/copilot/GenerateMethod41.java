package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class GenerateMethod41 extends GenerateMethodBase {
    /**
     * 将map中所有的key转为大写
     */
    public Map<String, Object> getAllUpperCase(Map<String, Object> map) {
        Map<String, Object> result = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            result.put(entry.getKey().toUpperCase(), entry.getValue());
        }
        return result;
    }
}
