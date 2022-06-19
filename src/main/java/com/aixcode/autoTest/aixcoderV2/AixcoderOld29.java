package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld29 extends GenerateMethodBase {
    public double euclideanDistance(double[] p, double[] q) {
        double distance = 0;
        for (int i = 0; i < p.length; i++) {
            distance += Math.pow((p[i] - q[i]), 2);
        }
        return Math.sqrt(distance);
    }
}
