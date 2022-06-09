package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew87 extends GenerateMethodBase {
    public boolean isInstanceOf(Object object, Class<?> type) {
        if (object == null) {
            return false;
        }
        return type.isAssignableFrom(object.getClass());
    }
}
