package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder124 {
    /**
     * Get one character of index i from a given string buffer.
     */
    public static char getChar(StringBuffer sb, int i) {
        if (i < sb.length()) {
            return sb.charAt(i);
        } else {
            // Modified
            return '\0';
        }
    }

}
