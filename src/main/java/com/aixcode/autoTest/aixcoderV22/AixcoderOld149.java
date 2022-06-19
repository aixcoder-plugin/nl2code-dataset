package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;

public class AixcoderOld149 extends GenerateMethodBase {
    public float getRadian(Point A, Point B)
        { 
float radian = 0 ; 
float dx = B . x - A . x ; 
float dy = B . y - A . y ; 
if ( dx != 0 ) { 
float f = ( float ) Math . atan ( dy / dx ) ; 
radian = ( float ) Math . toDegrees ( f ) ; 
} 
return radian ; 
} 
    }
