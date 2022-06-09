package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import javax.sound.sampled.Line;
import java.awt.*;

public class AixcoderNew74 extends GenerateMethodBase {
    public Point getIntersection(Line line1, Line line2) {
//        if (line1.b != line2.a) {
//            double d = line1.b * line2.c - line1.a * line2.b;
//            if (d == 0) {
//                return Point.ZERO;
//            } else {
//                double ua = (line1.c * line2.b - line1.b * line2.c) / d;
//                double ub = (line1.a * line2.c - line1.c * line2.a) / d;
//                if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
//// Proper intersection
//// Get the position of the intersection point on the line
//                    double xInt = (line1.a * ub + line1.b * ua) / (ua * ua + ub * ub);
//                    double yInt = (line2.a * ua + line2.b * ub) / (ua * ua + ub * ub);
//                    return new Point(xInt, yInt);
//                }
//            }
//        } else {
//            if (line1.a == line2.a) {
//// Lines are parallel
//                return Point.ZERO;
//            }
//// Lines are collinear
//            return null;
//        }
        return null;
    }
}
