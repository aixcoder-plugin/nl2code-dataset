package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;

public class Aixcoder169 extends GenerateMethodBase {
    public long remaining(ByteBuffer[] buffers) {
        long result = 0;

        for (ByteBuffer buffer : buffers) {
            result += buffer.remaining();
        }

        return result;
    }
}
