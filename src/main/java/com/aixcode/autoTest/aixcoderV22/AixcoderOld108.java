package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld108 extends GenerateMethodBase {
    public String removeAllWhiteSpaces(String str)
        { 
if ( str=="" ) {
return "" ; 
} 
StringBuilder sb = new StringBuilder ( str ) ; 
int sz = sb . length ( ) ; 
char c ; 
for ( int i = 0 ; i < sz ; i ++ ) { 
c = sb . charAt ( i ) ; 
if ( ! Character . isWhitespace ( c ) ) { 
sb . setCharAt ( i , ' ' ) ; 
} 
} 
return sb . toString ( ) ; 
} 
    }
