package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderAuto53 extends GenerateMethodBase {
    /**
     * Convert a primitive input array into its object array version (e.g. from int[] to Integer[]).
     */
    public Integer[] toObjectArray(int[] array) {
        Integer[] result = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
