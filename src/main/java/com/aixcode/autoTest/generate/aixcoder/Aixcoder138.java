package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder138 extends GenerateMethodBase {
    /**
     *   Convert byte array to binary String
     */
    @Override
    public String toBinary(byte[] value) {
        StringBuilder sb = new StringBuilder();

        for (byte b : value) {
            for (int j = 7; j >= 0; --j) {
                sb.append(((b & 1) == 0) ? '0' : '1');
                b >>= 1;
            }
        }

        return sb.toString();
    }
}
