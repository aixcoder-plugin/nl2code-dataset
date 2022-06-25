package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod89 extends GenerateMethodBase {
    /**
     * Add two integers, checking for overflow.
     */
    public boolean checkOverflow(int x, int y) {
        long s = (long) x + (long) y;

        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            return true;
        }

        return false;
    }
}
