package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderOld13 extends GenerateMethodBase {
    public String randomString(int length, String alphabet) {
        if (alphabet == null || alphabet.length() == 0) {
            throw new IllegalArgumentException("Alphabet must not be null or empty.");
        }
        if (length < 0) {
            throw new IllegalArgumentException("Length must not be negative.");
        }
        if (length > alphabet.length()) {
            throw new IllegalArgumentException("Length must not exceed alphabet length.");
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(new Random().nextInt(alphabet.length())));
        }
        return sb.toString();
    }
}
