package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew103 extends GenerateMethodBase {
    public boolean equals(double a, double b, double epsilon) {
        if (a == b)
            return true;
        if (a == 0)
            return false;
//        if (!isCombinable(a) || !isCombinable(b))
//            return false;
        if (epsilon >= 0) {
            double diff = Math.abs(a - b);
            if (a == b)
                return true;
            if (a < b)
                return diff < epsilon;
            return diff <= epsilon;
        } else {
// epsilon is negative, so a and b are not equal
            if (a == b)
                return true;
            if (a > b)
                return a - epsilon < b;
            return b + epsilon > a;
        }
    }
}
