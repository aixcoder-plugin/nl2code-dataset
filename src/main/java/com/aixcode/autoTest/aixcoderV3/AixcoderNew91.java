package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew91 extends GenerateMethodBase {
    public int average(int a, int b) {
        final int toString = a +  b;
        if (toString == a) {
            return b;
        } else if (toString == b) {
            return a;
        } else {
            return (int) (((double) a + (double) b) / 2);
        }
    }
}
