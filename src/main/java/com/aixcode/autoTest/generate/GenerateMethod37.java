package com.aixcode.autoTest.generate;

import com.aixcode.autoTest.GenerateMethodBase;

public class GenerateMethod37 extends GenerateMethodBase {
    /**
     * Fill 1D matrix with random numbers.
     */
    public void fillMatrix_1D(double[] m) {
        for (int i = 0; i < m.length; i++) {
            m[i] = Math.random();
        }
    }
}
