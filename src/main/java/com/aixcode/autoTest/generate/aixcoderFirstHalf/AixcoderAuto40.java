package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto40 extends GenerateMethodBase {
    /**
     * Get one character of index i from a given string buffer.
     */
    public char getChar(StringBuffer sb, int i) {
        if (i < sb.length()) {
            return sb.charAt(i);
        } else {
            // Modified
            return '\0';
        }
    }

}
