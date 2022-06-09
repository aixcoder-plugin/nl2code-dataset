package com.aixcode.autoTest.version1.copilot;

public class Copilot405 {
    /**
     * Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)    Returns true if two doubles are considered equal. Tests if the absolute difference between the two doubles has a difference less then a given double (epsilon)
     */
    public static boolean equals(double a, double b, double epsilon) {
        return Math.abs(a - b) < epsilon;
    }
}
