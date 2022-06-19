package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld67 extends GenerateMethodBase {
    public double[] multiplyTranspose(double[] vector, double[][] matrix)
        { 
double [ ] result = new double [ vector . length ] ; 
for ( int i = 0 ; i < vector . length ; i ++ ) { 
result [ i ] = 0 ; 
for ( int j = 0 ; j < matrix [ i ] . length ; j ++ ) { 
result [ i ] += vector [ i ] * matrix [ i ] [ j ] ; 
} 
} 
return result ; 
} 
    }
