package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld60 extends GenerateMethodBase {
    public String bytesToHex(byte[] bytes)
        { 
char [ ] hexChars = new char [ bytes . length * 2 ] ; 
for ( int j = 0 ; j < bytes . length ; j ++ ) { 
int v = bytes [ j ] & 0xFF ; 
//hexChars [ j * 2 ] = hexArray [ v >>> 4 ] ;
//hexChars [ j * 2 + 1 ] = hexArray [ v & 0x0F ] ;
} 
return new String ( hexChars ) ; 
} 
    }
