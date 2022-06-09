package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew78 extends GenerateMethodBase {
    public String replaceFirst(String str, String str1, String str2) {
        if (str == null || str1 == null || str2 == null)
            return null;
        return str.replaceAll(str1, str2);
    }
}
