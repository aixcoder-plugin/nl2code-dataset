package com.aixcode.autoTest.aixcoderV2;

import java.awt.*;
import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld84 extends GenerateMethodBase {
        public Point rotateY (double angle , Point point ) {
double x = point . x ;
double y = point . y  ;
double cos = Math . cos ( angle ) ; 
double sin = Math . sin ( angle ) ; 
x = x * cos - y * sin ;
y = x * sin + y * cos ;
return new Point((int)x,(int) y) ;
} 
    }
