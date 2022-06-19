package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld78 extends GenerateMethodBase {
    public String replaceFirst(String str, String str1, String str2) 
        { 
if ( str == null || str1 == null || str2 == null ) { 
return null ; 
} 
if ( str . indexOf ( str1 ) == -1 ) { 
return str ; 
} 
return str . substring ( 0 , str . indexOf ( str1 ) ) + str2 + str . substring ( str . indexOf ( str1 ) + str1 . length ( ) ) ; 
} 
    }
