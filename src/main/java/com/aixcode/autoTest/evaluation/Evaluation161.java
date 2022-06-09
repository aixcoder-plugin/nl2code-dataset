package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Evaluation161 extends AbstractBaseEvaluation {
    public Evaluation161(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    List<List<Point>> pointList = new ArrayList<>() {{
        add(new ArrayList<Point>() {{
            add(new Point(1, 1));
            add(new Point(23, 2));
            add(new Point(3, 13));
        }});
        add(new ArrayList<Point>() {{
            add(new Point(4, 5));
            add(new Point(4, 5));
        }});
        add(new ArrayList<Point>() {{
            add(new Point(6, 6));
        }});
        add(new ArrayList<Point>());
    }};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < pointList.size(); i++) {
            try {
                Point center = solution.getCenter(pointList.get(i));
                if (canonicalSolution(pointList.get(i)) == null) {
                    if (center == null) {
                        passCount++;
                    }
                } else {
                    if (center.equals(canonicalSolution(pointList.get(i)))) {
                        passCount++;
                    }
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, pointList.size()};
    }

    private Point canonicalSolution(List<Point> points) {
        if (points == null || points.size() == 0) {
            return null;
        }
        int x = 0;
        int y = 0;
        for (Point p : points) {
            x += p.x;
            y += p.y;
        }
        return new Point(x / points.size(), y / points.size());
    }
}
