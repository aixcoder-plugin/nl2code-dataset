package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld14 extends GenerateMethodBase {
    public void init(int[][] arr, int n) 
        { 
for ( int i = 0 ; i < n ; i ++ ) { 
for ( int j = 0 ; j < n ; j ++ ) { 
arr [ i ] [ j ] = ( int ) ( Math . random ( ) * 10 ) ; 
} 
} 
} 
    }
