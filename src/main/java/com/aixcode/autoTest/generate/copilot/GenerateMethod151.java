package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod151 extends GenerateMethodBase {
    /**
     *  Converts from an int array to an Integer array.
     */
    @Override
    public Integer[] asObjectArray(int[] array) {
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
