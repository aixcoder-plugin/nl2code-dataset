package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod174 extends GenerateMethodBase {
    /**
     * 判定一个字符串是不是整数
     */
    public boolean isInteger(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
