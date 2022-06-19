package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld6 extends GenerateMethodBase {
    public void putShort(byte[] data, short value, int offset)
        { 
data [ offset ] = ( byte ) ( ( value >>> 0 ) & 0xFF ) ; 
data [ offset + 1 ] = ( byte ) ( ( value >>> 8 ) & 0xFF ) ; 
} 
    }
