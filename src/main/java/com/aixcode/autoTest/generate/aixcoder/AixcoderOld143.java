package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.regex.Pattern;

public class AixcoderOld143 extends GenerateMethodBase {
    public boolean matchesPattern(String _string, Pattern[] _patterns)
        { 
for ( Pattern p : _patterns ) { 
if ( p . matcher ( _string ) . matches ( ) ) { 
return true ; 
} 
} 
return false ; 
} 
    }
