package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder151 extends GenerateMethodBase {
    /**
     *  Converts from an int array to an Integer array.
     */
    @Override
    public Integer[] asObjectArray(int[] array) {
        Integer[] objectArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) objectArray[i] = array[i];

        return objectArray;
    }
}
