package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderAuto41 extends GenerateMethodBase {
    /**
     * 将map中所有的key转为大写
     */
    public Map<String, Object> getAllUpperCase(Map<String, Object> map) {
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
