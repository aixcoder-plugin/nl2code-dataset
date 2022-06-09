package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod1 extends GenerateMethodBase {
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
