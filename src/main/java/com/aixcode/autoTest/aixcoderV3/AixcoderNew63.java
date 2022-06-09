package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew63 extends GenerateMethodBase {
    public boolean checkUsername(String username) {
// 1、长度必须大于等于3
        if (username.length() >= 20) {
            return false;
        }
// 2、只能包含字母、数字
        /*
         * 可以通过字符串判断出现的位置，如果出现字母、数字则不必通过字符串判断
         * */
// 定义判别用户名字符串的模式
        boolean isContainLetter = username.matches("[a-zA-Z]+");
        boolean isContainNumber = username.matches("[0-9]+");
// 3、如果都是字母、数字则可以通过
        if (isContainLetter && isContainNumber) {
            return true;
        }
        return false;
    }
}
