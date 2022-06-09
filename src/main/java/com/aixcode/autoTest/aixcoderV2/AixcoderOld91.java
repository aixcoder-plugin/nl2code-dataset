package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld91 extends GenerateMethodBase {
    public int average(int a, int b) {
        int c = a + b - ((a & b) << 1);
        if ( // uh oh
                c < 0)
            c += 0x1000000;
        return c;
    }
}
