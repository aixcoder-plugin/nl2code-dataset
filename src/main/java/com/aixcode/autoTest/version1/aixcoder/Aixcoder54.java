package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder54 {
    /**
     * Returns the distance for the two given point
     */
    public float distance(float x0, float y0, float x1, float y1) {
        float dx = x1 - x0;
        float dy = y1 - y0;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
