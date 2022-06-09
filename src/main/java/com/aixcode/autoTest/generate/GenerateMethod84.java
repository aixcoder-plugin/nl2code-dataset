package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class GenerateMethod84 extends GenerateMethodBase {
    /**
     * Rotate this a two-dimensional point around Y axis with the given angle in radians.
     */
    public Point rotateY(double angle, Point point) {
        double x = point.x * Math.cos(angle) - point.y * Math.sin(angle);
        double y = point.x * Math.sin(angle) + point.y * Math.cos(angle);
        return new Point((int) x, (int) y);
    }
}
