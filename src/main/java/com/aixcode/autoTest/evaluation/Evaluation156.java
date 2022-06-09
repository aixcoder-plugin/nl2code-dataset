package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.Arrays;

public class Evaluation156 extends AbstractBaseEvaluation {

    public float[][] addA = new float[][]{
            {1, 21, 3},
            {13, 25, 33, 43, 10},
            {7, 9},
            {}
    };
    public float[][] addB = new float[][]{
            {3, 4, 15},
            {4, 25, 8},
            {12, 73, 39, 57},
            {}
    };
    public float[][] addC = new float[][]{
            {4, 25, 18},
            {17, 50, 41, 43, 10},
            {19, 82},
            {}
    };


    public Evaluation156(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < addA.length; i++) {
            try {
                float[] a = addA[i];
                float[] cp = Arrays.copyOf(a, a.length);
                float[] b = addB[i];
                float[] c = addC[i];
                solution.addTo(cp, b);
                if (!Arrays.equals(cp, c)) {
                    passCount++;
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, addA.length};
    }
}
