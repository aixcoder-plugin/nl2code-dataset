package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto20 extends GenerateMethodBase {
    /**
     * Returns the value of an array by index, or null if the array has no value at that index.
     */
    public Object get(Object[] array, int index) {
        if (array == null) {
            return null;
        }

        if (index < 0) {
            return null;
        }

        if (index >= array.length) {
            return null;
        }

        return array[index];
    }
}
