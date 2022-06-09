package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class GenerateMethod149 extends GenerateMethodBase {
    /**
     *  Get the radian between current line(determined by point A and B) and horizontal line.
     */
    @Override
    public float getRadian(Point A, Point B) {
        float radian = (float) (Math.atan2(B.y - A.y, B.x - A.x));
        return radian;
    }
}
