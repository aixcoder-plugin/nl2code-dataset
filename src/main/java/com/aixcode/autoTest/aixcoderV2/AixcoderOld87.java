package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderOld87 extends GenerateMethodBase {
    public boolean isInstanceOf(Object object, Class<?> type) {
        if (object == null) {
            return false;
        }
        if (type.isInstance(object)) {
            return true;
        }
        if (object instanceof String) {
            return type.isAssignableFrom(object.getClass());
        }
        return false;
    }
}
