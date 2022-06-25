package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder60 extends GenerateMethodBase {
        public String bytesToHex ( byte [ ] bytes ) { 
StringBuilder sbuf = new StringBuilder ( ) ; 
for ( int idx = 0 ; idx < bytes . length ; idx ++ ) { 
int intVal = bytes [ idx ] & 0xff ; 
if ( intVal < 0x10 ) 
sbuf . append ( "0" ) ; 
sbuf . append ( Integer . toHexString ( intVal ) . toUpperCase ( ) ) ; 
} 
return sbuf . toString ( ) ; 
} 
    }
