package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto33 extends GenerateMethodBase {
    public double logSum(double[] logInputs) {
        double logSum = 0.0;

        for (int i = 0; i < logInputs.length; i++) {
            logSum += Math.log(logInputs[i]);
        }

        return logSum;
    }
}
