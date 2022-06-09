package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld103 extends GenerateMethodBase {
    public boolean equals(double a, double b, double epsilon) {
        if (Math.abs(a - b) <= epsilon)
            return true;
        return false;
    }
}
