package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto85 extends GenerateMethodBase {
    public String appendTrailing(String str, String trailing) {
        if (isBlank(str)) {
            return trailing;
        }

        if (isBlank(trailing)) {
            return str;
        }

        return str + "" + trailing;
    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }
}
