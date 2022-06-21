package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod58 extends GenerateMethodBase {
    /**
     * Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
     */
    public byte[] intToByteArray(int value){
        return new byte[]{
                (byte) (value >>> 24),
                (byte) (value >>> 16),
                (byte) (value >>> 8),
                (byte) value};
    }
}
