package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld31 extends GenerateMethodBase {
    public int indexOf(int[] array, int element) 
        { 
if ( array == null ) { 
return -1 ; 
} 
for ( int i = 0 ; i < array . length ; i ++ ) { 
if ( array [ i ] == element ) { 
return i ; 
} 
} 
return -1 ; 
} 
    }
