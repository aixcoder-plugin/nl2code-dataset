package com.aixcode.autoTest.version1.copilot;

public class Copilot317 {
    /**
     * Returns the sum of logarithms, which is Sum( Log(x[i]) ).
     */
    public static double logSum(double[] x) {
        double sum = 0;
        for (double xi : x) {
            sum += Math.log(xi);
        }
        return sum;
    }

}
