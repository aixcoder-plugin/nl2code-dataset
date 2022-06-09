package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod108 extends GenerateMethodBase {

    /**
     * Removes all white spaces from a string A whitespace is identified using the Java method Character.isWhiteSpace
     */
    public String removeAllWhiteSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
