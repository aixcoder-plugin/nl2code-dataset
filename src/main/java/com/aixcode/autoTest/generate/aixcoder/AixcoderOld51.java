package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld51 extends GenerateMethodBase {
    public int hashCode(byte[] byteArr)
        { 
int hashCode = 0 ; 
for ( int i = 0 ; i < byteArr . length ; i ++ ) { 
// bit set index of byte i is index of bit at which the byte i is set
int bitIndex = i % Byte . SIZE ; 
int arrayIndex = i / Byte . SIZE ; 

} 
return hashCode ; 
} 
    }
