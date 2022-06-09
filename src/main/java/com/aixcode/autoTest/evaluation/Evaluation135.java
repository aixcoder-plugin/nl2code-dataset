package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation135 extends AbstractBaseEvaluation {
    public Evaluation135(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        short[] expectedReturn = new short[]{0,Short.MAX_VALUE,Short.MIN_VALUE,Short.MAX_VALUE,Short.MIN_VALUE};
        short[] inputParam = new short[]{0,Short.MAX_VALUE,Short.MIN_VALUE,Short.MIN_VALUE,Short.MAX_VALUE};
        short[] inputParam2 = new short[]{100, 2, 2,-2,-2};
        int pass_count = 0;
        int total_count = inputParam.length;

        for (int i = 0; i < total_count; i++) {
            long actualReturn = 0;
            try {
                actualReturn = solution.multiply(inputParam[i], inputParam2[i]);
                if (actualReturn == expectedReturn[i]) {
                    pass_count++;
                }
            } catch (Exception e) {
            }
        }

        return new int[]{pass_count, total_count};
    }
}
