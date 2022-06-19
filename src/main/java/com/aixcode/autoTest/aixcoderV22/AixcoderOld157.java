package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld157 extends GenerateMethodBase {
    public int lastIndexOf(float value, float[] array)
        { 
for ( int i = array . length -1 ; i >= 0 ; i -- ) { 
if ( array [ i ] == value ) { 
return i ; 
} 
} 
return -1 ; 
} 
    }
