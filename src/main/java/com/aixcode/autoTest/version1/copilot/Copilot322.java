package com.aixcode.autoTest.version1.copilot;

public class Copilot322 {
    /**
     * Creates a padding string of a certain length
     */
    public String createPadding(int length, char padChar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }
}
