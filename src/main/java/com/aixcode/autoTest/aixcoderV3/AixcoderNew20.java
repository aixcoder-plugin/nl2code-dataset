package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.lang.reflect.Array;

public class AixcoderNew20 extends GenerateMethodBase {
    public Object get(Object[] array, int index) {
        if (array.length == 0) {
            return null;
        }
        if (!array[0].getClass().isArray()) {
            return null;
        }
        if (array.length == 1) {
            return Array.get(array[0], index);
        }
// Simply stupid Java compiler
        if ((index < 0) || (index >= Array.getLength(array))) {
            return null;
        }
// Used internally to perform an array access
        int i = 0;
        for (Object obj : array) {
            if (i++ == index) {
                return obj;
            }
        }
        return null;
    }
}
