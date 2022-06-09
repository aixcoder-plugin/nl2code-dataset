package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder375 {
    /**
     * Helper function to convert a long number into a byte array (least significant byte first).
     */
    public static byte[] longToBytes(long x) {
        byte[] b = new byte[8];

        for (int i = 0; i < 8; i++) {
            b[i] = (byte) x;
            x >>>= 8;
        }

        return b;
    }

}
