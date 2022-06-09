package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto5 extends GenerateMethodBase {
    /**
     * max() that works on three integers. Like many of the other max() functions in this class
     */
    public float max(float a, float b, float c) {
        float max = Math.max(a, b);
        max = Math.max(max, c);
        return max;
    }
}
