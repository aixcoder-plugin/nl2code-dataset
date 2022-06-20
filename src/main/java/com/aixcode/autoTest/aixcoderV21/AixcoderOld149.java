package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class AixcoderOld149 extends GenerateMethodBase {
    public float getRadian(Point A, Point B) {
        if (A == null || B == null) {
            return 0;
        }
        float dx = B.x - A.x;
        float dy = B.y - A.y;
        return (float) Math.atan(dy / dx);
    }
}
