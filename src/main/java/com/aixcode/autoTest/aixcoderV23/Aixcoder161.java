package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;

import java.awt.*;
import java.util.List;

public class Aixcoder161 extends GenerateMethodBase {
        public Point getCenter (List < Point > points ) {
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
