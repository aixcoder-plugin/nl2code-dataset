package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew35 extends GenerateMethodBase {
    public void ensureNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("argument must not be null");
        }
    }
}
