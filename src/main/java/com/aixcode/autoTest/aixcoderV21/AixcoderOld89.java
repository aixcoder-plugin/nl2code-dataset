package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld89 extends GenerateMethodBase {
    public boolean checkOverflow(int x, int y)
        { 
long m = ( ( long ) x ) + ( ( long ) y ) ; 
if ( m < Integer . MIN_VALUE || m > Integer . MAX_VALUE ) { 
return false ; 
} 
return true ; 
} 
    }
