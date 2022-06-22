package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.Point;
import java.util.List;

public class AixcoderOld161 extends GenerateMethodBase {
    public Point getCenter(List<Point> points)
        { 
if ( points . size ( ) == 0 ) { 
return null ; 
} 
int x = 0 ; 
int y = 0 ; 
for ( Point p : points ) { 
if ( p != null ) { 
x += p . x ; 
y += p . y ; 
} 
} 
return new Point ( x / points . size ( ) , y / points . size ( ) ) ; 
} 
    }
