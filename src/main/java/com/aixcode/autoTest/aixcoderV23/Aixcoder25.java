package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder25 extends GenerateMethodBase {
        public String toHex ( byte [ ] byteArr ) { 
char [ ] hexChars = new char [ byteArr . length * 2 ] ; 
for ( int j = 0 ; j < byteArr . length ; j ++ ) { 
int v = byteArr [ j ] & 0xFF ; 
hexChars [ j * 2 ] = (char) byteArr [ v >>> 4 ] ;
hexChars [ j * 2 + 1 ] = (char) byteArr [ v & 0x0F ] ;
} 
return new String ( hexChars ) ; 
} 
    }
