package com.aixcode.autoTest.version1.copilot;

public class Copilot273 {
    /**
     * Check if #MIN_VALUE <= value <= #MAX_VALUE and if not an IllegalArgumentException is thrown.
     */
    public static void checkRange(int value, int min, int max) {
        if (value < min || value > max) {
            throw new IllegalArgumentException("Value out of range: " + value);
        }
    }
}
