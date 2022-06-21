package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld98 extends GenerateMethodBase {
    public String convertMnemonicString(String text)
        { 
StringBuilder sb = new StringBuilder ( ) ; 
int prevIndex = 0 ; 
int nextIndex = text . indexOf ( '&' ) ; 
int len = text . length ( ) ; 
while ( nextIndex != -1 ) { 
String s = text . substring ( prevIndex , nextIndex ) ; 
sb . append ( s ) ; 
nextIndex ++ ; 
if ( nextIndex != len && text . charAt ( nextIndex ) == '&' ) { 
sb . append ( '&' ) ; 
nextIndex ++ ; 
} 
prevIndex = nextIndex ; 
nextIndex = text . indexOf ( '&' , nextIndex + 1 ) ; 
} 
sb . append ( text . substring ( prevIndex , text . length ( ) ) ) ; 
return sb . toString ( ) ; 
} 
    }
