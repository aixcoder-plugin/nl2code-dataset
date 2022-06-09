package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;


public class AixcoderOld85 extends GenerateMethodBase {
    public String appendTrailing(String str, String trailing) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (trailing=="") {
            return trailing;
        }

        if (str.endsWith("\n")) {
            return str + trailing;
        }
        if (str.endsWith("\r")) {
            return str.concat(trailing);
        }
        return str + "\n" + trailing;
    }
}
