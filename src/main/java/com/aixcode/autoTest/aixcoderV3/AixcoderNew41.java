package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;

public class AixcoderNew41 extends GenerateMethodBase {
    public Map<String, Object> getAllUpperCase(Map<String, Object> map) {
        Map<String, Object> tempMap = new HashMap<>();
        map.forEach((k, v) -> {
            String key = k.toUpperCase();
            if (tempMap.containsKey(key)) {
                throw new RuntimeException("大写的Key：" + key + "，不能重复放入同一个Map！");
            }
            tempMap.put(key, v);
        });
        return tempMap;
    }
}
