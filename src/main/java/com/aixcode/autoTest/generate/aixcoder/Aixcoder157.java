package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder157 extends GenerateMethodBase {
    /**
     * Searches backward for value in a given array,not found return -1
     */
    public int lastIndexOf(float value, float[] array) {
        if (value > array[array.length - 1]) {
            return -1;
        }

        int index = -1;
        int i = (int)((array.length - 1) - value) / 2;

        while (i >= 0) {
            if (array[i] == value) {
                index = i;
                break;
            } else if (value > array[i]) {
                i--;
            } else {
                i++;
            }
        }

        return index;
    }
}
