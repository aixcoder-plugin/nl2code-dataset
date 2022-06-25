package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld38 extends GenerateMethodBase {
    public int linearSearch(int[] arr, int key) 
        { 
for ( int i = 0 ; i < arr . length ; i ++ ) { 
if ( key == arr [ i ] ) { 
return i ; 
} 
} 
return -1 ; 
} 
    }
