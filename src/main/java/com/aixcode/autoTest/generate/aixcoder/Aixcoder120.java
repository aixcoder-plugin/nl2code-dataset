package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder120 extends GenerateMethodBase {
    public int compare(double double1, double double2) {
        if (double1 < double2) {
            return -1;
        } else if (double1 > double2) {
            return 1;
        } else {
            return 0;
        }
    }
}
