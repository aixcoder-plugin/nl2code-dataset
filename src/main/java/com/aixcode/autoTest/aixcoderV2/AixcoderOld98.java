package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld98 extends GenerateMethodBase {
        public String convertMnemonicString ( String text ) { 
StringBuilder buf = new StringBuilder ( ) ; 
int prevIndex = 0 ; 
int nextIndex = text . indexOf ( '&' ) ; 
int len = text . length ( ) ; 
while ( nextIndex != -1 ) { 
String s = text . substring ( prevIndex , nextIndex ) ; 
buf . append ( s ) ; 
nextIndex ++ ; 
if ( nextIndex != len && text . charAt ( nextIndex ) == '&' ) { 
buf . append ( '&' ) ; 
nextIndex ++ ; 
} 
prevIndex = nextIndex ; 
nextIndex = text . indexOf ( '&' , nextIndex + 1 ) ; 
} 
buf . append ( text . substring ( prevIndex , text . length ( ) ) ) ; 
return buf . toString ( ) ; 
} 
    }
