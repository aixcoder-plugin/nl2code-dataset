package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class GenerateMethod70 extends GenerateMethodBase {
    /**
     * Calculate the elapsed time between two times specified in milliseconds.
     */
    public long elapsedTime(Calendar start, Calendar end) {
        return end.getTimeInMillis() - start.getTimeInMillis();
    }
}
