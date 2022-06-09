package com.aixcode.autoTest.version1.copilot;

public class Copilot400 {
    /**
     * If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result
     */
    public static String appendTrailing(String str, String trailing) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (str.endsWith(trailing)) {
            return str;
        }
        return str + trailing;
    }
}
