package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod157 extends GenerateMethodBase {
    /**
     * Searches backward for value in a given array,not found return -1
     */
    public int lastIndexOf(float value, float[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
