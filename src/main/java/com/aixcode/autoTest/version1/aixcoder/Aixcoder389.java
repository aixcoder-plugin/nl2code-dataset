package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder389 {
    /**
     * Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
     */
    public static byte[] intToByteArray(int value) {
        byte[] src = new byte[4];
        src[0] = (byte)(value);
        src[1] = (byte)((value >>> 8));
        src[2] = (byte)((value >>> 16));
        src[3] = (byte)((value >>> 24));
        return src;
    }
}
