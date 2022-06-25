package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder51 extends GenerateMethodBase {
        public int hashCode ( byte [ ] byteArr ) { 
int hashCode = 0 ; 
for ( int i = 0 ; i < byteArr . length ; i ++ ) { 
// bit set index of byte i is index of bit at which the byte i is set
int bitIndex = i % Byte . SIZE ; 
int arrayIndex = i / Byte . SIZE ; 
if ( (byteArr [ arrayIndex ] & ( 1 << bitIndex ))!=0 ) {
hashCode += bitIndex ; 
} 
} 
return hashCode ; 
} 
    }
