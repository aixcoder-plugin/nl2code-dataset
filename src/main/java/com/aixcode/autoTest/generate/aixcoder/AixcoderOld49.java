package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld49 extends GenerateMethodBase {
    public byte[] longToBytes(long x)
        { 
byte [ ] b = new byte [ 8 ] ; 
for ( int i = 0 ; i < 8 ; i ++ ) { 
b [ i ] = ( byte ) x ; 
x >>>= 8 ; 
} 
return b ; 
} 
    }
