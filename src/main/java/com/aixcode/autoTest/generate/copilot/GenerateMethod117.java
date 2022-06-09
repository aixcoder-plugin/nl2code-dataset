package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod117 extends GenerateMethodBase {

    /**
     * 概述：截取指定长度的数组
     */
    public byte[] subBytes(byte[] src, int pos, int count) {
        byte[] bs = new byte[count];
        for (int i = 0; i < count; i++) {
            bs[i] = src[pos + i];
        }
        return bs;
    }
}
