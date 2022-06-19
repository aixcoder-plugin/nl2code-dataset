package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

import static java.lang.Integer.MAX_VALUE;

public class AixcoderOld89 extends GenerateMethodBase {
    public boolean checkOverflow(int x, int y)
        { 
if ( x < 0 || y < 0 ) { 
return true ; 
} 
if ( x > MAX_VALUE - y ) {
return true ; 
} 
if ( y > MAX_VALUE - x ) { 
return true ; 
} 
return false ; 
} 
    }
