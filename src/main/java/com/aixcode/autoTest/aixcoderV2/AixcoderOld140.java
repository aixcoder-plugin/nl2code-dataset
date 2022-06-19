package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class AixcoderOld140 extends GenerateMethodBase {
    public String toString(ByteBuffer buffer, int position, int length, Charset charset) {
        if (buffer == null)
            return null;
        if (buffer.hasArray())
            return new String(buffer.array(), buffer.arrayOffset() + position, length, charset);
        else {
            byte[] data = new byte[length];
            buffer.get(data);
            return new String(data, charset);
        }
    }
}
