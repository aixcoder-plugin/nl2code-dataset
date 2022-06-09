package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew29 extends GenerateMethodBase {
    public double euclideanDistance(double[] p, double[] q) {
        double ret = 0;
        for (int i = 0; i < p.length; i++) {
            double diff = (q[i] - p[i]);
            double sq = Math.pow(diff, 2);
            ret += sq;
        }
        return Math.sqrt(ret);
    }
}
