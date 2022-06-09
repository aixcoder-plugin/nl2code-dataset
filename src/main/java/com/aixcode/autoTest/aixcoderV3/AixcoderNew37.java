package com.aixcode.autoTest.aixcoderV3;

import com.aixcode.autoTest.GenerateMethodBase;

import java.util.Random;

public class AixcoderNew37 extends GenerateMethodBase {
    public void fillMatrix_1D(double[] m) {
        Random r = new Random(2);
        for (int i = 0; i < m.length; i++) {
            m[i] = r.nextDouble();
        }
    }
}
