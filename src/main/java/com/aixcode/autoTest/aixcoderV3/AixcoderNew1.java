package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew1 extends GenerateMethodBase {
    public String createPadding(int length, char padChar) {
        StringBuffer padding = new StringBuffer();
        for (int i = 0; i < length; i++) {
            padding.append(padChar);
        }
        return padding.toString();
    }
}
