package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld108 extends GenerateMethodBase {
    public String removeAllWhiteSpaces(String str) {
        if (str == null) {
            return null;
        }
        int sz = str.length();
        StringBuilder buffer = new StringBuilder(sz);
        boolean space = false;
        for (int i = 0; i < sz; i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                buffer.append(ch);
                space = true;
            } else if (space) {
                buffer.append(' ');
                space = false;
            }
        }
        return buffer.toString();
    }
}
