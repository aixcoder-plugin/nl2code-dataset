package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder251 {
    /**
     * 用str2替换字符串str中第一个出现的str1
     */
    public static String replaceFirst(String str, String str1, String str2) {
        if (str == null || str1 == null || str2 == null) {
            return null;
        }

        return str.replaceFirst(str1, str2);
    }
}
