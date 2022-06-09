package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.security.NoSuchAlgorithmException;

public class AixcoderNew51 extends GenerateMethodBase {
    public int hashCode(byte[] byteArr)
            throws NoSuchAlgorithmException {
        int c = 0;
        for (int i = 0; i < byteArr.length; i++) {
            c += byteArr[i];
        }
        return c;
    }
}
