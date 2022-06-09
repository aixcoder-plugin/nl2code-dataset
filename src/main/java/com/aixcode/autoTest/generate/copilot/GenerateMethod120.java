package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod120 extends GenerateMethodBase {

    /**
     * Compares the two specified double values,return 1 if the first value is greater than the second value,-1 if the first value is less than the second value,0 if the two values are equal. There are two special cases: Double.NaN is equal to Double.NaN and it is greater than any other double value, including Double.POSITIVE_INFINITY; +0.0d is greater than -0.0d
     */
    public int compare(double double1, double double2) {
        if (double1 > double2) {
            return 1;
        } else if (double1 < double2) {
            return -1;
        } else {
            return 0;
        }
    }
}
