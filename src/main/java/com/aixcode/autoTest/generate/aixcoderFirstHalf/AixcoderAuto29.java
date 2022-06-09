package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto29 extends GenerateMethodBase {
    /**
     * This returns the euclidean distance of two vectors sum(i=1,n) (q_i - p_i)^2
     */
    public double euclideanDistance(double[] p, double[] q) {
        double distance = 0;

        for (int i = 0; i < p.length; i++) {
            distance += (p[i] - q[i]) * (p[i] - q[i]);
        }

        return Math.sqrt(distance);
    }
}
