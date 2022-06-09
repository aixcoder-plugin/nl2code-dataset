package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod153 extends GenerateMethodBase {
    /**
     *  计算 C2 = M xor t
     */
    @Override
    public byte[] calculateC2(byte[] m, byte[] t) {
        byte[] c2 = new byte[m.length];
        for (int i = 0; i < m.length; i++) {
            c2[i] = (byte) (m[i] ^ t[i]);
        }
        return c2;
    }
}
