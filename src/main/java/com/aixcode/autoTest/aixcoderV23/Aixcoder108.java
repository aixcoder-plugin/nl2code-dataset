package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder108 extends GenerateMethodBase {
        public String removeAllWhiteSpaces ( String str ) { 
if (  ( str==null ) ) {
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
