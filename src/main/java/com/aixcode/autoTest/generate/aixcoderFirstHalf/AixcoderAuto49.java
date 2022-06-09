package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto49 extends GenerateMethodBase {
    /**
     * Helper function to convert a long number into a byte array (least significant byte first).
     */
    public byte[] longToBytes(long x) {
        byte[] b = new byte[8];

        for (int i = 0; i < 8; i++) {
            b[i] = (byte) x;
            x >>>= 8;
        }

        return b;
    }

}
