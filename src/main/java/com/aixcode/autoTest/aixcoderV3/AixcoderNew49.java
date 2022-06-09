package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew49 extends GenerateMethodBase {
    public byte[] longToBytes(long x) {
        byte[] out = new byte[8];
        long tmpin = x;
        for (int i = 0; i < 8; i++) {
            out[i] = (byte) tmpin;
            tmpin = tmpin >> 8;
        }
        return out;
    }
}
