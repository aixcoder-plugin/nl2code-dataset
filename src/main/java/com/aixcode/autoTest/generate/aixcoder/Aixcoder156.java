package com.aixcode.autoTest.generate.aixcoder;

import com.aixcode.autoTest.GenerateMethodBase;

public class Aixcoder156 extends GenerateMethodBase {
    public void addTo(float[] arrayA, float[] arrayB) {
        if (arrayA.length != arrayB.length)
            throw new RuntimeException("The two arrays must have the same length!");

        for (int i = 0; i < arrayA.length; i++) arrayA[i] += arrayB[i];
    }
}
