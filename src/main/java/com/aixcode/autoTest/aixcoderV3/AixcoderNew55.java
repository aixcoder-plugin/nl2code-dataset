package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew55 extends GenerateMethodBase {
    public boolean isLetterOrDigit(String str) {
        String regex = "^[a-zA-Z0-9]+$";
        return str.matches(regex);
    }
}
