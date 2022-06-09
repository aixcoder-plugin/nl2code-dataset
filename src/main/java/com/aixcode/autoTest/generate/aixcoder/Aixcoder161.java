package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.Point;
import java.util.List;


public class Aixcoder161 extends GenerateMethodBase {
    public Point getCenter(List<Point> points) {
        int n = points.size();

        if (n < 1) {
            throw new IllegalArgumentException("must have at least 1 point");
        }

        double x = 0;
        double y = 0;

        for (int i = 0; i < n; i++) {
            Point p = points.get(i);
            x += p.getX();
            y += p.getY();
        }

        return new Point((int) x / n, (int) y / n);
    }


}
