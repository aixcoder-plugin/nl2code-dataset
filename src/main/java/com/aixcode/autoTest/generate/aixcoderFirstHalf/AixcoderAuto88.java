package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto88 extends GenerateMethodBase {
    public int hexStringToInt(String hexString) {
        int result = 0;
        int index = 0;
        int n = 0;
        int b = 0;

        for (int i = 0; i < hexString.length(); i++) {
            index = i % 2;
            n = Integer.valueOf(hexString.substring(i, i + 1), 16);
            b = Integer.valueOf(hexString.substring(i + 1, i + 2), 16);
            result += (b << index * 4);
        }

        return result;
    }
}