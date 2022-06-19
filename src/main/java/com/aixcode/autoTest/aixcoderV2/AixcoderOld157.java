package com.aixcode.autoTest.aixcoderV2;

import com.aixcode.autoTest.GenerateMethodBase;
public class AixcoderOld157 extends GenerateMethodBase {
    public int lastIndexOf(float value, float[] array) {
        if (value > array[array.length - 1]) {
            return -1;
        }
        int index = -1;
        int i = (int) ((array.length - 1) - value) / 2;
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
