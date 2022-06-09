package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod85 extends GenerateMethodBase {
    /**
     * If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result
     */
    public String appendTrailing(String str, String trailing) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        if (str.endsWith(trailing)) {
            return str;
        }
        return str + trailing;
    }
}
