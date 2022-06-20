package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld33 extends GenerateMethodBase {
    public double logSum(double[] x) {
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
            sum += Math.log(x[i]);
        }
        return max + Math.log(sum);
    }
}
