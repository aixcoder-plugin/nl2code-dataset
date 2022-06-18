package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld118 extends GenerateMethodBase {
    public int floor(double val) {
        int i = (int) val;
        return val < i ? i - 1 : i;
    }
}
