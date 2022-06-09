package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder23 {
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
