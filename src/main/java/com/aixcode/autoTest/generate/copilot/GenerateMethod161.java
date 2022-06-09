package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.Point;
import java.util.List;

public class GenerateMethod161 extends GenerateMethodBase {
    /**
     * Returns the geometric center of this sequence of points
     */
    public Point getCenter(List<Point> points) {
        if (points == null || points.size() == 0) {
            return null;
        }
        int x = 0;
        int y = 0;
        for (Point point : points) {
            x += point.x;
            y += point.y;
        }
        return new Point(x / points.size(), y / points.size());
    }
}
