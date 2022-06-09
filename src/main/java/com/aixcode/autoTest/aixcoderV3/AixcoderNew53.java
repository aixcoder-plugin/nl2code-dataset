package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

public class AixcoderNew53 extends GenerateMethodBase {
    public Integer[] toObjectArray(int[] array) {
        Integer[] objectArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            objectArray[i] = array[i];
        }
        return objectArray;
    }
}
