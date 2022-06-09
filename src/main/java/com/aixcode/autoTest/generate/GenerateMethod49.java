package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod49 extends GenerateMethodBase {
    /**
     * Helper function to convert a long number into a byte array (least significant byte first).
     */
    public byte[] longToBytes(long x) {
        byte[] bytes = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bytes[i] = (byte) (x & 0xff);
            x >>= 8;
        }
        return bytes;
    }

}
