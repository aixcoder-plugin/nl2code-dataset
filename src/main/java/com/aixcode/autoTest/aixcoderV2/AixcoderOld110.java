package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld110 extends GenerateMethodBase {
    public float parseFloat(String floatStr) {
        try {
            return Float.parseFloat(floatStr);
        } catch (NumberFormatException e) {
            return Float.NaN;
        }
    }
}
