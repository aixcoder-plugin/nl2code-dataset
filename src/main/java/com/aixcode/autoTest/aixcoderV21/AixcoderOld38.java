package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld38 extends GenerateMethodBase {
    public int linearSearch(int[] arr, int key) 
        { 
for ( int i = 0 ; i < arr . length ; i ++ ) { 
if ( arr [ i ] == key ) { 
return i ; 
} 
} 
return -1 ; 
} 
    }
