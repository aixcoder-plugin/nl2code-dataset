package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto58 extends GenerateMethodBase {
    /**
     * Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit ordering.
     */
    public byte[] intToByteArray(int value) {
        byte[] src = new byte[4];
        src[0] = (byte)(value);
        src[1] = (byte)((value >>> 8));
        src[2] = (byte)((value >>> 16));
        src[3] = (byte)((value >>> 24));
        return src;
    }
}
