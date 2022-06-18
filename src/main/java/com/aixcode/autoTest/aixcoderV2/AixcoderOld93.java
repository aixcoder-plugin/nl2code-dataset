package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld93 extends GenerateMethodBase {
        public boolean isNumber ( String str ) 
if ( StringUtils . isEmpty ( str ) ) { 
return false ; 
} 
char [ ] chars = str . toCharArray ( ) ; 
int sz = chars . length ; 
boolean hasExp = false ; 
boolean hasDecPoint = false ; 
boolean allowSigns = false ; 
boolean foundDigit = false ; 
// deal with any possible sign up front
int start = ( chars [ 0 ] == '-' ) ? 1 : 0 ; 
if ( sz > start + 1 ) { 
if ( chars [ start ] == '0' && chars [ start + 1 ] == 'x' ) { 
int i = start + 2 ; 
if ( i == sz ) { 
return false ; 
} 
// checking hex (it can't be anything else)
for ( ; i < chars . length ; i ++ ) { 
ch = chars [ i ] ; 
if ( ( ch < '0' || ch > '9' ) && ( ch < 'a' || ch > 'f' ) && ( ch < 'A' || ch > 'F' ) ) { 
return false ; 
} 
} 
return true ; 
} 
} 
// don't want to loop to the last char, check it afterwords
sz -- ; 
// for type qualifiers
int i = start ; 
// make a valid number (e.g. chars[0..5] = "1234E")
while ( i < sz || ( i < sz + 1 && allowSigns && ! foundDigit ) ) { 
if ( chars [ i ] >= '0' && chars [ i ] <= '9' ) { 
foundDigit = true ; 
allowSigns = false ; 
} else if ( chars [ i ] == '.' ) { 
if ( hasDecPoint || hasExp ) { 
// two decimal points or dec in exponent
return false ; 
} 
hasDecPoint = true ; 
} else if ( chars [ i ] == 'e' || chars [ i ] == 
    }
