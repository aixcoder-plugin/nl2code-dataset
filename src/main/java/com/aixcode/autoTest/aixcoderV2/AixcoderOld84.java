package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld84 extends GenerateMethodBase {
        public Point rotateY ( double angle , Point point ) { 
double x = point . x - this . x ; 
double y = point . y - this . y ; 
double cos = Math . cos ( angle ) ; 
double sin = Math . sin ( angle ) ; 
this . x = x * cos - y * sin ; 
this . y = x * sin + y * cos ; 
return this ; 
} 
    }
