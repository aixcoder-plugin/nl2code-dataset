package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod88 extends GenerateMethodBase {
    /**
     * 将16进制字符串转10进制
     */
    public int hexStringToInt(String hexString) {
        int result = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            int value = 0;
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                value = c - 'a' + 10;
            } else if (c >= 'A' && c <= 'F') {
                value = c - 'A' + 10;
            }
            result = result * 16 + value;
        }
        return result;
    }
}
