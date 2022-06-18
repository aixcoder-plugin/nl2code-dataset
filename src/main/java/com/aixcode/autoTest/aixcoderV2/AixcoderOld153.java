package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld153 extends GenerateMethodBase {
    public byte[] calculateC2(byte[] m, byte[] t) {
        if (t == null || t.length != 32) {
            throw new IllegalArgumentException("calculateC2 input parameter t invalid");
        }
        if (m == null || m.length != 32) {
            throw new IllegalArgumentException("calculateC2 input parameter m invalid");
        }
        byte[] result = new byte[32];
        for (int i = 0; i < 32; i++) {
            result[i] = (byte) (m[i] ^ t[i]);
        }
        return result;
    }
}
