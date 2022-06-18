package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld78 extends GenerateMethodBase {
        public String replaceFirst ( String str , String str1 , String str2 ) 
if ( str == null || str1 == null || str2 == null ) { 
return null ; 
} 
if ( str . indexOf ( str1 ) == -1 ) { 
return str ; 
} 
index = str . indexOf ( str1 ) ; 
if ( index == -1 ) { 
return str ; 
} 
int len = str . length ( ) ; 
StringBuffer sb = new StringBuffer ( len ) ; 
sb . append ( str . substring ( 0 , index ) ) ; 
sb . append ( str2 ) ; 
sb . append ( str . substring ( index + str1 . length ( ) , len ) ) ; 
return sb . toString ( ) ; 
} 
    }
