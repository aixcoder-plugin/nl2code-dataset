package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Calendar;

public class AixcoderNew70 extends GenerateMethodBase {
    public long elapsedTime(Calendar start, Calendar end) {
        if (start == null || end == null) {
            return -1;
        }
        return end.getTimeInMillis() - start.getTimeInMillis();
    }
}
