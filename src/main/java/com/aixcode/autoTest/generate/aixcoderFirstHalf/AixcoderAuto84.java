package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class AixcoderAuto84 extends GenerateMethodBase {
    public Point rotateY(double angle, Point point) {
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        int x = (int) Math.round(point.x * cos - point.y * sin);
        int y = (int) Math.round(point.x * sin + point.y * cos);
        return new Point(x, y);
    }
}
