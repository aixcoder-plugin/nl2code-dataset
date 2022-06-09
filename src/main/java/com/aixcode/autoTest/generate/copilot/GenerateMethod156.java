package com.aixcode.autoTest.generate.copilot;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod156 extends GenerateMethodBase {
    /**
     * Adds a given vector (array) to another one. * Every element of the second array (missing element is treated to be zero) is added to the corresponding element (if not missing) of the first array.
     */
    public void addTo(float[] arrayA, float[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] += arrayB[i];
        }
    }
}
