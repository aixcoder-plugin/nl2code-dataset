package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder317 {
    public static double logSum(double[] logInputs) {
        double logSum = 0.0;

        for (int i = 0; i < logInputs.length; i++) {
            logSum += Math.log(logInputs[i]);
        }

        return logSum;
    }
}
