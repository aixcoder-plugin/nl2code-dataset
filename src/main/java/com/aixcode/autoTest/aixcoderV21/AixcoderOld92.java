package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld92 extends GenerateMethodBase {
    public void checkRange(int value, int min, int max)
        { 
if ( ( value < min ) || ( value > max ) ) { 
throw new IllegalArgumentException ( "Value is out of range : " + value ) ; 
} 
} 
    }
