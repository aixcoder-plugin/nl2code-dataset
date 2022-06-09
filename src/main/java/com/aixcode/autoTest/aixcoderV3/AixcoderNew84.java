package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class AixcoderNew84 extends GenerateMethodBase {
    public Point rotateY(double angle, Point point) {
// translating output point
        double xTranslated = point.x;
        double yTranslated = point.y ;
// rotation
        double cosAngle = Math.cos(angle);
        double sinAngle = Math.sin(angle);
        double x = xTranslated * cosAngle - yTranslated * sinAngle;
        double y = yTranslated * cosAngle + xTranslated * sinAngle;
// update with new values
        point.x = (int) x;
        point.y = (int) y;
        return point;
    }
}
