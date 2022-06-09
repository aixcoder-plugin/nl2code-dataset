package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew58 extends GenerateMethodBase {
    public byte[] intToByteArray(int value) {
        byte[] src = new byte[4];
        src[0] = (byte) (value & 0xFF);
        src[1] = (byte) ((value >> 8) & 0xFF);
        src[2] = (byte) ((value >> 16) & 0xFF);
        src[3] = (byte) ((value >> 24) & 0xFF);
        return src;
    }
}
