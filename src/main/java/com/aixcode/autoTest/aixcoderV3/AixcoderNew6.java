package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew6 extends GenerateMethodBase {
    public void putShort(byte[] data, short value, int offset) {
        int i = offset;
        data[i++] = (byte) ((value) & 0xFF);
        data[i] = (byte) ((value >>> 8) & 0xFF);
    }
}
