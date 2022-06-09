package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderNew52 extends GenerateMethodBase {
    public void remove(Map<Integer, String> mapObj, Integer key) {
        if (mapObj == null || key == null) {
            return;
        }
        mapObj.remove(key);
    }
}
