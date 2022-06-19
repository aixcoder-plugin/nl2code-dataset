package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld121 extends GenerateMethodBase {
    public int getNextSlash(String path, int index)
        { 
int nextSlash = path . indexOf ( '/' , index + 1 ) ; 
if ( nextSlash == -1 || nextSlash == path . length ( ) -1 ) { 
return -1 ; 
} 
return nextSlash ; 
} 
    }
