package com.aixcode.autoTest.version1.copilot;

public class Copilot95 {
    /**
     * put a short value into a byte array with specific offset
     */
    public static void putShort(byte[] data, short value, int offset) {
        data[offset] = (byte) (value >> 8);
        data[offset + 1] = (byte) value;
    }

}
