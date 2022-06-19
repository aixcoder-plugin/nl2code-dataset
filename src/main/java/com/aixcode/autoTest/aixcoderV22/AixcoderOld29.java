package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld29 extends GenerateMethodBase {
    public double euclideanDistance(double[] p, double[] q)
        { 
double distance = 0 ; 
for ( int i = 0 ; i < p . length ; i ++ ) { 
distance += ( p [ i ] - q [ i ] ) * ( p [ i ] - q [ i ] ) ; 
} 
return Math . sqrt ( distance ) ; 
} 
    }
