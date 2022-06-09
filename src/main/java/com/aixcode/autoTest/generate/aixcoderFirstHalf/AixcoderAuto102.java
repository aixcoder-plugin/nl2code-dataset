package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderAuto102 extends GenerateMethodBase {
    public int size(Map<String, String> map) {
        int size = 0;

        for (String key : map.keySet()) {
            size += map.get(key).length();
        }

        return size;
    }
}
