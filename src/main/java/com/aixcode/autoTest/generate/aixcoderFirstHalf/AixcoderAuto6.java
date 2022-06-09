package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto6 extends GenerateMethodBase {
    /**
     * put a short value into a byte array with specific offset
     */
    public void putShort(byte[] data, short value, int offset) {
        data[offset] = (byte)((value >>> 0) & 0xFF);
        data[offset + 1] = (byte)((value >>> 8) & 0xFF);
    }
}
