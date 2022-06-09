package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder95 {
    /**
     * put a short value into a byte array with specific offset
     */
    public static void putShort(byte[] data, short value, int offset) {
        data[offset] = (byte)((value >>> 0) & 0xFF);
        data[offset + 1] = (byte)((value >>> 8) & 0xFF);
    }
}
