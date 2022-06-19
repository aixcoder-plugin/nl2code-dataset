package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld1 extends GenerateMethodBase {
    public String createPadding(int length, char padChar)
        { 
StringBuffer sb = new StringBuffer ( ) ; 
for ( int i = 0 ; i < length ; i ++ ) { 
sb . append ( padChar ) ; 
} 
return sb . toString ( ) ; 
} 
    }
