package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.List;
import java.util.Map;

public class AixcoderNew44 extends GenerateMethodBase {
    public void removeNullValue(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || key.equals("")) {
                continue;
            }
            if (value == null) {
                map.remove(key);
            }
            if (value instanceof List) {
//                removeNullValue((List) value);
            }
        }
    }
}
