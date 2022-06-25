package com.aixcode.autoTest.aixcoderV23;

import com.aixcode.autoTest.GenerateMethodBase;
public class Aixcoder58 extends GenerateMethodBase {
        public byte [ ] intToByteArray ( int value ) { 
byte [ ] src = new byte [ 4 ] ; 
src [ 0 ] = ( byte ) ( value ) ; 
src [ 1 ] = ( byte ) ( ( value >>> 8 ) ) ; 
src [ 2 ] = ( byte ) ( ( value >>> 16 ) ) ; 
src [ 3 ] = ( byte ) ( ( value >>> 24 ) ) ; 
return src ; 
} 
    }
