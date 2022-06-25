package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder110 extends GenerateMethodBase {
        public float parseFloat ( String floatStr ) { 
if ( floatStr == null ) 
return -1 ; 
return new Float ( floatStr ) . floatValue ( ) ; 
} 
    }
