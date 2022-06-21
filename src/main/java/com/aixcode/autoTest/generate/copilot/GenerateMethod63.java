package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod63 extends GenerateMethodBase {
    /**
     * 检验用户名是否合法，只能包括a-z,A-Z,0-9和下划线_，不能以下划线结尾 用户名有最小长度和最大长度限制，比如用户名必须是4-20位
     */
    public boolean checkUsername(String username) {
        if (username.length() < 4 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c != '_' && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                return false;
            }
        }
        return true;
    }
}
