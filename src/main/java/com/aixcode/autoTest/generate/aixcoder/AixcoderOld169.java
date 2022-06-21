package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;

public class AixcoderOld169 extends GenerateMethodBase {
    public long remaining(ByteBuffer[] buffers)
        { 
long size = 0 ; 
for ( ByteBuffer buffer : buffers ) { 
size += buffer . remaining ( ) ; 
} 
return size ; 
} 
    }
