package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod55 extends GenerateMethodBase {
    /**
     * 判断字符串是否只含字母和数字
     */
    public boolean isLetterOrDigit(String str) {
        return str.matches("^[a-zA-Z0-9]+$");
    }
}
