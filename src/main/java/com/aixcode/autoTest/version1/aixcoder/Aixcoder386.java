package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder386 {
    /**
     * 判断字符串是否只含字母和数字
     */
    public static boolean isLetterOrNumer(String str) {
        String regex = "^[a-zA-Z0-9]+$";
        return str.matches(regex);
    }
}
