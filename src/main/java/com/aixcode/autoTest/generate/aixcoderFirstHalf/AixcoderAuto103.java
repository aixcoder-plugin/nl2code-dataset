package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto103 extends GenerateMethodBase {
    public boolean equals(double a, double b, double epsilon) {
        if (a == b)
            return true;
        else if (Math.abs(a - b) < epsilon)
            return true;
        else
            return false;
    }
}
