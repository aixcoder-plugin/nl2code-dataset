package com.aixcode.autoTest.version1.aixcoder;

import java.util.Random;

public class Aixcoder263 {
    /**
     * Returns a string, consisting of given length random char from given alphabet.
     */
    public static String randomString(int length, String alphabet) {
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
