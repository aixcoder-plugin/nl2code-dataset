package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation157 extends AbstractBaseEvaluation {
    public Evaluation157(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    float[][] arrayA = new float[][]{
            {1, 2, 3, 12, 4, 3, 10},
            {},
            {21, 21, 21, 24, 21, 21, 21},
            {31},
            {41}
    };
    float[] targets = new float[]{
            3, 2, 21, 4, 41};
    int[] indexs = new int[]{
            5, -1, 6, -1, 0};

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (int i = 0; i < arrayA.length; i++) {
            try {
                float[] a = arrayA[i];
                float target = targets[i];
                int index = indexs[i];
                int result = solution.lastIndexOf(target, a);
                if (result == index) {
                    passCount++;
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, arrayA.length};
    }
}
