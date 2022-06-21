package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod33 extends GenerateMethodBase {
    /**
     * Returns the sum of logarithms, which is Sum( Log(x[i]) ).
     */
    public double logSum(double[] x) {
        double sum = 0;
        for (double xi : x) {
            sum += Math.log(xi);
        }
        return sum;
    }

}
