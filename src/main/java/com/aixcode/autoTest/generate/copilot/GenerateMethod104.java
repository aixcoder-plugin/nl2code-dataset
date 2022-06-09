package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod104 extends GenerateMethodBase {
    /**
     * Puts a byte and a short into this byte vector. The byte vector is automatically enlarged if necessary.
     */
    public void putShort(byte[] data, byte b, short s) {
        data[0] = b;
        data[1] = (byte)((s >>> 0) & 0xFF);
        data[2] = (byte)((s >>> 8) & 0xFF);
    }

}
