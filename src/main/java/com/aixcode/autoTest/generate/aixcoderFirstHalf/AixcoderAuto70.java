package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderAuto70 extends GenerateMethodBase {
    /**
     * Calculate the elapsed time between two times specified in milliseconds.
     */
    public long elapsedTime(Calendar start, Calendar end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }

        long startMs = start.getTimeInMillis();
        long endMs = end.getTimeInMillis();
        return (endMs - startMs);
    }
}
