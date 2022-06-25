package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod92 extends GenerateMethodBase {
    /**
     * Check if #MIN_VALUE <= value <= #MAX_VALUE and if not an IllegalArgumentException is thrown.
     */
    public void checkRange(int value, int min, int max) {
        if (value < min || value > max) {
            throw new IllegalArgumentException("Value out of range: " + value);
        }
    }
}
