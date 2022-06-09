package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder405 {
    public static boolean equals(double a, double b, double epsilon) {
        if (a == b)
            return true;
        else if (Math.abs(a - b) < epsilon)
            return true;
        else
            return false;
    }
}
