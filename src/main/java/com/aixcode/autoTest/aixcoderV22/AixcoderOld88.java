package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld88 extends GenerateMethodBase {
    public int hexStringToInt(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return -1;
        }
        int result = 0;
        int index = 0;
        int n = 0;
        while (index < hexString.length() - 1) {
            n = Integer.valueOf(hexString.charAt(index));
            if (n < 0) {
                return -1;
            }
            result = result + n * 16;
            index++;
        }
        return result;
    }
}
