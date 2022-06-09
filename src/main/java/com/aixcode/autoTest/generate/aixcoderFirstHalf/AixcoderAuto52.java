package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Map;

public class AixcoderAuto52 extends GenerateMethodBase {
    public void remove(Map<Integer, String> mapObj, Integer key) {
        if (mapObj == null || key == null) {
            return;
        }

        mapObj.remove(key);
    }
}
