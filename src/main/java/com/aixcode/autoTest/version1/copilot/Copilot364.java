package com.aixcode.autoTest.version1.copilot;

import java.util.Calendar;

public class Copilot364 {
    /**
     * Calculate the elapsed time between two times specified in milliseconds.
     */
    public static long elapsedTime(Calendar start, Calendar end) {
        return end.getTimeInMillis() - start.getTimeInMillis();
    }
}
