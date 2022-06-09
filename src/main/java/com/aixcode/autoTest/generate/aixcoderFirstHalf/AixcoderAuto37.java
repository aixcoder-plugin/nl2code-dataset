package com.aixcode.autoTest.generate.aixcoderFirstHalf;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderAuto37 extends GenerateMethodBase {
    /**
     * Fill 1D matrix with random numbers.
     */
    public void fillMatrix_1D(double[] m) {
        Random r = new Random(2);

        for (int i = 0; i < m.length; i++) m[i] = r.nextDouble();
    }
}
