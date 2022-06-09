package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder115 extends GenerateMethodBase {
    public String[] toTimestampStrs(long[] timestamps) {
        if (timestamps == null) {
            return null;
        }

        String[] result = new String[timestamps.length];

        for (int i = 0; i < timestamps.length; ++i) {
            result[i] = Long.toString(timestamps[i]);
        }

        return result;
    }
}
