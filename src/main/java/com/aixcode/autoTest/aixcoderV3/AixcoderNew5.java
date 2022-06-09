package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew5 extends GenerateMethodBase {
    public float max(float a, float b, float c) {
        if (a > b)
            return (a > c ? a : c);
        else
            return (b > c ? b : c);
    }
}
