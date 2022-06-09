package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto92 extends GenerateMethodBase {
    public void checkRange(int value, int min, int max) {
        if ((value < min) || (value > max)) {
            throw new IllegalArgumentException("Value is out of range:" + value);
        }
    }
}
