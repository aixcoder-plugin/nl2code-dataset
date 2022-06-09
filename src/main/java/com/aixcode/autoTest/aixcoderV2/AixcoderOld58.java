package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld58 extends GenerateMethodBase {
    public byte[] intToByteArray(int value) {
        byte[] src = new byte[4];
        src[0] = (byte) (value & 0xff);
        src[1] = (byte) ((value >> 8) & 0xff);
        src[2] = (byte) ((value >> 16) & 0xff);
        src[3] = (byte) ((value >> 24) & 0xff);
        return src;
    }
}
