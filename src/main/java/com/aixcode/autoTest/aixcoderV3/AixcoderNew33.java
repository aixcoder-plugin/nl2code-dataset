package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew33 extends GenerateMethodBase {
    public double logSum(double[] x) {
//        if (x.length != size())
//            throw new IllegalArgumentException("The length of the given array must be " + size());
        double logSum = 0.0;
        for (int i = 0; i < x.length; i++) {
            logSum += Math.log(x[i]);
        }
        return logSum;
    }
}
