package com.aixcode.autoTest.version1.copilot;

public class Copilot114 {
    /**
     * max() that works on three integers. Like many of the other max() functions in this class
     */
    public static float max(float a, float b, float c) {
        float max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
