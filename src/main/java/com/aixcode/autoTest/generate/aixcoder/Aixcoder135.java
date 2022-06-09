package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder135 extends GenerateMethodBase {
    /**
     *  Multiply two Short numbers.
     */
    @Override
    public Short multiply(Short a, Short b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        int bigNumber = Integer.max(Math.abs(a), Math.abs(b));
        int smallNumber = Integer.min(Math.abs(a), Math.abs(b));
        int maxMultiplier = Short.MAX_VALUE / bigNumber;

        if (smallNumber < maxMultiplier) {
            return Integer.valueOf(a * b).shortValue();
        } else {
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                return Short.MIN_VALUE;
            } else {
                return Short.MAX_VALUE;
            }
        }
    }
}
