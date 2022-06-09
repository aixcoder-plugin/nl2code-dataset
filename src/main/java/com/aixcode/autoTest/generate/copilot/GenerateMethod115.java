package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod115 extends GenerateMethodBase {

    /**
     * Parse a list of longs into strings.
     */
    public String[] toTimestampStrs(long[] timestamps) {
        String[] timestampsStr = new String[timestamps.length];
        for (int i = 0; i < timestamps.length; i++) {
            timestampsStr[i] = String.valueOf(timestamps[i]);
        }
        return timestampsStr;
    }
}
