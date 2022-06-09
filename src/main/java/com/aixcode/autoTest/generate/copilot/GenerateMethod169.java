package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;

public class GenerateMethod169 extends GenerateMethodBase {
    /**
     * Returns the total number of bytes remaining in the buffer array.
     */
    public long remaining(ByteBuffer[] buffers) {
        long remaining = 0;
        for (ByteBuffer buffer : buffers) {
            remaining += buffer.remaining();
        }
        return remaining;
    }
}
