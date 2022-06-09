package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew92 extends GenerateMethodBase {
    public void checkRange(int value, int min, int max)
            throws IllegalArgumentException {
        if ((value < min) || (value > max)) {
            throw new IllegalArgumentException("Value " + value + " is out of range [" + min + ", " + max + "]");
        }
    }
}
