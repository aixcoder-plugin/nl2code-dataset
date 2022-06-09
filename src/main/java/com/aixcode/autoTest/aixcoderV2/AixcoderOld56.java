package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld56 extends GenerateMethodBase {
    public boolean isLetter(char c) {
        if (c > 'z' || c < 'a') {
            return false;
        }
        return true;
    }
}
