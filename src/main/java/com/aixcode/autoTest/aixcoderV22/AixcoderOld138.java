package com.aixcode.autoTest.aixcoderV22;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld138 extends GenerateMethodBase {
    public String toBinary(byte[] pBytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : pBytes) {
            for (int j = 7; j >= 0; j--) {
                result.append(((b & 1) == 0) ? '0' : '1');
                b >>= 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AixcoderOld138().toBinary(new byte[]{0x01, 0x02}));
    }
}
