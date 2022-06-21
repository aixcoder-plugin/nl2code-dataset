package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld112 extends GenerateMethodBase {
    public double length(double[] p0, double[] p1)
        { 
double sum = 0 ; 
for ( int i = 0 ; i < p0 . length ; i ++ ) { 
double d = p0 [ i ] - p1 [ i ] ; 
sum += d * d ; 
} 
return Math . sqrt ( sum ) ; 
} 
    }
