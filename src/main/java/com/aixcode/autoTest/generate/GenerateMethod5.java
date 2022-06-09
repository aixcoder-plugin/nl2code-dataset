package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod5 extends GenerateMethodBase {
    /**
     * max() that works on three integers. Like many of the other max() functions in this class
     */
    public float max(float a, float b, float c) {
        float max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
