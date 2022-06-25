package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld180 extends GenerateMethodBase {
    public boolean isBin(String bin)
        { 
if ( bin == null || bin . length ( ) % 8 != 0 ) { 
return false ; 
} 
return true ; 
} 
    }
