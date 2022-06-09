package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew88 extends GenerateMethodBase {
    public int hexStringToInt(String hexString) {
        int result = 0;
        int len = hexString.length();
        if (len > 0) {
            for (int i = len - 1; i >= 0; i--) {
                int d = Character.digit(hexString.charAt(i), 16);
                if (d == -1) {
                    throw new IllegalArgumentException("Illegal hexadecimal string");
                }
                result = result * 16 + d;
            }
        }
        return result;
    }
}
