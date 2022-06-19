package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld80 extends GenerateMethodBase {
    public int randomInt(int origin, int bound) {
        if (origin >= bound) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return (int) (origin + ((bound - origin) * Math.random()));
    }
}
