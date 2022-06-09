package com.aixcode.autoTest.version1.copilot;

public class Copilot26 {
    /**
     * Check whether the String is a valid Java number
     */
    public static boolean isNumber(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            i = 1;
        }
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
