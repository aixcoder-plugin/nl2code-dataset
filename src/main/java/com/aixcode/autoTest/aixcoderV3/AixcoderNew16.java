package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew16 extends GenerateMethodBase {
    public int hashCode(double[] vector) {
        if (vector == null) {
            return 0;
        }
        int h = 1;
        for (int i = 0; i < vector.length; ++i) {
            final double x = vector[i];
            h = 31 * h + Double.hashCode(x);
        }
        return h;
    }
}
