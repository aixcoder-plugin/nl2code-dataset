package com.aixcode.autoTest.version1.copilot;

public class Copilot22 {
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
