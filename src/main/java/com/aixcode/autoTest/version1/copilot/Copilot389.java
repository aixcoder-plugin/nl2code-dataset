package com.aixcode.autoTest.version1.copilot;

public class Copilot389 {
    /**
     * Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
     */
    public static byte[] intToByteArray(int value){
        return new byte[]{
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value};
    }
}
