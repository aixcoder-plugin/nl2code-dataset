package com.aixcode.autoTest.version1.aixcoder;

import java.util.Calendar;

public class Aixcoder364 {
    /**
     * Calculate the elapsed time between two times specified in milliseconds.
     */
    public static long elapsedTime(Calendar start, Calendar end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }

        long startMs = start.getTimeInMillis();
        long endMs = end.getTimeInMillis();
        return (endMs - startMs);
    }
}
