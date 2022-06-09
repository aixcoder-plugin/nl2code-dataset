package com.aixcode.autoTest.version1.aixcoder;

import java.util.Random;

public class Aixcoder315 {
    /**
     * Fill 1D matrix with random numbers.
     */
    public static void fillMatrix_1D(double[] m) {
        Random r = new Random(2);

        for (int i = 0; i < m.length; i++) m[i] = r.nextDouble();
    }
}
