package com.aixcode.autoTest.version1.copilot;

import java.awt.*;

public class Copilot399 {
    /**
     * Rotate this a two-dimensional point around Y axis with the given angle in radians.
     */
    public static Point rotateY(double angle, Point point) {
        double x = point.x * Math.cos(angle) - point.y * Math.sin(angle);
        double y = point.x * Math.sin(angle) + point.y * Math.cos(angle);
        return new Point((int) x, (int) y);
    }
}
