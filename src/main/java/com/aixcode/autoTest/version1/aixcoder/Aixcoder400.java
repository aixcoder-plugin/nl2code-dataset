package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder400 {
    public static String appendTrailing(String str, String trailing) {
        if (isBlank(str)) {
            return trailing;
        }

        if (isBlank(trailing)) {
            return str;
        }

        return str + "" + trailing;
    }

    private static boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }
}
