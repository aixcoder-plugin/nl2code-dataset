package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld96 extends GenerateMethodBase {
    public double[] product(double[] columnVector,double[][] matrix)
        { 
if ( columnVector . length != matrix [ 0 ] . length ) { 
throw new IllegalArgumentException ( "The column vector and matrix must have the same length." ) ; 
} 
double [ ] product = new double [ matrix . length ] ; 
for ( int i = 0 ; i < matrix . length ; i ++ ) { 
product [ i ] = 0 ; 
for ( int j = 0 ; j < matrix [ 0 ] . length ; j ++ ) { 
product [ i ] += matrix [ i ] [ j ] * columnVector [ j ] ; 
} 
} 
return product ; 
} 
    }
