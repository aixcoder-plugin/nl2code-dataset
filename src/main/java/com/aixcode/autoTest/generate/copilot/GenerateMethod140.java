package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class GenerateMethod140 extends GenerateMethodBase {
    /**
     *   Convert a partial buffer to a String.
     */
    @Override
    public String toString(ByteBuffer buffer, int position, int length, Charset charset) {
        byte[] bytes = new byte[length];
        buffer.position(position);
        buffer.get(bytes);
        return new String(bytes, charset);
    }
}
