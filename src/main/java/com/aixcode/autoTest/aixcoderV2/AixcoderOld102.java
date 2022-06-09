package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderOld102 extends GenerateMethodBase {
    public int size(Map<String, String> map) {
        int total = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            total += entry.getValue().length();
        }
        return total;
    }
}
