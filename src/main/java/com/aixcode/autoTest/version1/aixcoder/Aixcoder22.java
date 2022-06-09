package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder22 {
    public boolean checkOverflow(int x, int y) {
        long m = ((long) x) + ((long) y);

        if (m < Integer.MIN_VALUE || m > Integer.MAX_VALUE) {
            return false;
        }

        return true;
    }
}
