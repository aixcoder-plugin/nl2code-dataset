package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod103 extends GenerateMethodBase {
    /**
     * Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)    Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
     */
    public boolean equals(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }
}
