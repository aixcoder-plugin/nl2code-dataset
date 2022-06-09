package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod138 extends GenerateMethodBase {
    /**
     *   Convert byte array to binary String
     */
    @Override
    public String toBinary(byte[] pBytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : pBytes) {
            sb.append(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        }
        return sb.toString();
    }
}
