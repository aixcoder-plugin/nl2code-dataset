package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld176 extends GenerateMethodBase {
    public boolean getBinaryState(int targetInteger, int position) {
        if (position < 1 || position > 32) {
            throw new IllegalArgumentException("Position out of bound.Should be between 1 and 32.");
        }

        int value = 1 << (position - 1);
        return (targetInteger & value) == value;
    }
    }
