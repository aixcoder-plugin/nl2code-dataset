package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder118 extends GenerateMethodBase {
    public int floor(double val) {
        int i = (int) val;
        return val < i ? i - 1 : i;
    }
}
