package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld110 extends GenerateMethodBase {
    public float parseFloat(String floatStr)
        { 
if ( floatStr == null ) 
return -1 ; 
return new Float ( floatStr ) . floatValue ( ) ; 
} 
    }
