package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto56 extends GenerateMethodBase {
    /**
     * 判断是否只含字母
     */
    public boolean isLetter(char c) {
        if (c >= 'a' && c <= 'z')
            return true;
        else
            return false;
    }
}
