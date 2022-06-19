package com.aixcode.autoTest.aixcoderV21;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;

public class AixcoderOld169 extends GenerateMethodBase {
    public long remaining(ByteBuffer[] buffers)
        { 
long result = 0 ; 
for ( ByteBuffer buffer : buffers ) { 
result += buffer . remaining ( ) ; 
} 
return result ; 
} 
    }
