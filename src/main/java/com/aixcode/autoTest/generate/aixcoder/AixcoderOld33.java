package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld33 extends GenerateMethodBase {
    public double logSum(double[] x) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.log(x[i]);
        }
        return sum;
    }
}
