package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.HashMap;
import java.util.Map;
public class AixcoderOld41 extends GenerateMethodBase {
    public Map<String, Object> getAllUpperCase(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Map<String, Object> mapUpper = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            mapUpper.put((entry.getKey().toUpperCase()), entry.getValue());
        }
        return mapUpper;
    }
}
