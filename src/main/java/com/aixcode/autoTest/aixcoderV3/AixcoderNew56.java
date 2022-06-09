package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew56 extends GenerateMethodBase {
    public boolean isLetter(char c) {
        int k = 0x80;
        return c / k == 0;
    }
}
