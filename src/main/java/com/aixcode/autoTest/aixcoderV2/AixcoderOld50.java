package com.aixcode.autoTest.aixcoderV2;

import java.util.*;
import java.io.*;
import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld50 extends GenerateMethodBase {
        public String bytesToHexString ( byte [ ] src ) { 
StringBuilder stringBuilder = new StringBuilder ( "" ) ; 
if ( src == null || src . length <= 0 ) { 
return null ; 
} 
for ( int i = 0 ; i < src . length ; i ++ ) { 
int v = src [ i ] & 0xFF ; 
String hv = Integer . toHexString ( v ) ; 
if ( hv . length ( ) < 2 ) { 
stringBuilder . append ( 0 ) ; 
} 
stringBuilder . append ( hv ) ; 
} 
return stringBuilder . toString ( ) ; 
} 
    }
