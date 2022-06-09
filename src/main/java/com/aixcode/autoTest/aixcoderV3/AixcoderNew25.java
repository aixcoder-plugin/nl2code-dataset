package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew25 extends GenerateMethodBase {
    public final String toHex(byte[] byteArr) {
        StringBuilder hexBuilder = new StringBuilder();
        for (int i = 0; i < byteArr.length; i++) {
            hexBuilder.append(Integer.toHexString(byteArr[i] & 0xff));
        }
        return hexBuilder.toString();
    }
}
