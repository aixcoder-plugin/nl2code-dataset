package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto55 extends GenerateMethodBase {
    /**
     * 判断字符串是否只含字母和数字
     */
    public boolean isLetterOrDigit(String str) {
        String regex = "^[a-zA-Z0-9]+$";
        return str.matches(regex);
    }
}
