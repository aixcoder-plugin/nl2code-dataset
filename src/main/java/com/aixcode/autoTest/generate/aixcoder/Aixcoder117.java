package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder117 extends GenerateMethodBase {
    public byte[] subBytes(byte[] src, int pos, int count) {
        byte[] dest = new byte[count];
        System.arraycopy(src, pos, dest, 0, count);
        return dest;
    }
}
