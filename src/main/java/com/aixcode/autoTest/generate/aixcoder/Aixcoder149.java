package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class Aixcoder149 extends GenerateMethodBase {
    /**
     *  Get the radian between current line(determined by point A and B) and horizontal line.
     */
    @Override
    public float getRadian(Point A, Point B) {
        if (A == null || B == null) {
            return 0;
        }

        float dx = B.x - A.x;
        float dy = B.y - A.y;
        return (float) Math.atan(dy / dx);
    }
}
