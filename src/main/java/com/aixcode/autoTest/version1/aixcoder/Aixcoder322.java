package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder322 {
    /**
     * Creates a padding string of a certain length
     */
    public String createPadding(int length, char padChar) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            sb.append(padChar);
        }

        return sb.toString();
    }
}
