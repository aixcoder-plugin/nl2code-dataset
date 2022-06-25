package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder46 extends GenerateMethodBase {
        public void matrixMultiply ( double [ ] [ ] A , double [ ] [ ] B ) throws Exception { 
//checkMatrixDimensions ( A , B ) ;
for ( int i = 0 ; i < A.length ; i ++ ) {
for ( int j = 0 ; j < A[0].length ; j ++ ) {
A [ i ] [ j ] = A [ i ] [ j ] * B [ i ] [ j ] ; 
} 
} 
} 
    }
