package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod122 extends GenerateMethodBase {

    /**
     * Returns true iff all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
     */
    public boolean isNonNegative(long[][] in) {
        if (in == null) {
            return true;
        }
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
