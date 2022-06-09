package com.aixcode.autoTest.version1.copilot;

public class Copilot375 {
    /**
     * Helper function to convert a long number into a byte array (least significant byte first).
     */
    public static byte[] longToBytes(long x) {
        byte[] bytes = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bytes[i] = (byte) (x & 0xff);
            x >>= 8;
        }
        return bytes;
    }

}
