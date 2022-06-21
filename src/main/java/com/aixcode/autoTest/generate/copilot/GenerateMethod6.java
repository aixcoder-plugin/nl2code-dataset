package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod6 extends GenerateMethodBase {
    /**
     * put a short value into a byte array with specific offset
     */
    public void putShort(byte[] data, short value, int offset) {
        data[offset] = (byte) (value >> 8);
        data[offset + 1] = (byte) value;
    }




}
