package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderAuto13 extends GenerateMethodBase {
    /**
     * Returns a string, consisting of given length random char from given alphabet.
     */
    public String randomString(int length, String alphabet) {
        if (alphabet == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(new Random().nextInt(alphabet.length())));
        }

        return sb.toString();
    }
}
