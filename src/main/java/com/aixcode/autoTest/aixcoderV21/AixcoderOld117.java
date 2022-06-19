package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld117 extends GenerateMethodBase {
    public byte[] subBytes(byte[] src, int pos, int count)
        { 
byte [ ] dest = new byte [ count ] ; 
System . arraycopy ( src , pos , dest , 0 , count ) ; 
return dest ; 
} 
    }
