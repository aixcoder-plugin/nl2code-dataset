package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld120 extends GenerateMethodBase {
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
