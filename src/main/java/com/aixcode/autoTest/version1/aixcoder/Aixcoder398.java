package com.aixcode.autoTest.version1.aixcoder;

public class Aixcoder398 {
    /**
     * 检验用户名是否合法，只能包括a-z,A-Z,0-9和下划线_，不能以下划线结尾 用户名有最小长度和最大长度限制，比如用户名必须是4-20位
     */
    public static boolean checkUsername(String username) {
        if (username.length() > 20) {
            return false;
        }

        if (username.length() < 4 || username.length() > 10) {
            return false;
        }

        if (!username.matches("[a-zA-Z0-9_]+")) {
            return false;
        }

        return true;
    }
}
