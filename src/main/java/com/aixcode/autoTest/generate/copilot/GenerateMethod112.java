package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod112 extends GenerateMethodBase {

    /**
     * Calculates the distance between two points in high-dimensional space.
     */
    public double length(double[] p0, double[] p1) {
        double sum = 0;
        for (int i = 0; i < p0.length; i++) {
            sum += (p0[i] - p1[i]) * (p0[i] - p1[i]);
        }
        return Math.sqrt(sum);
    }
}
