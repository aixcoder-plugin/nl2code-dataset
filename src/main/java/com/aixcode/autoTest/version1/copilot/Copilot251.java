package com.aixcode.autoTest.version1.copilot;

public class Copilot251 {
    /**
     * 用str2替换字符串str中第一个出现的str1
     */
    public static String replaceFirst(String str, String str1, String str2) {
        int index = str.indexOf(str1);
        if (index == -1) {
            return str;
        }
        return str.substring(0, index) + str2 + str.substring(index + str1.length());
    }
}
