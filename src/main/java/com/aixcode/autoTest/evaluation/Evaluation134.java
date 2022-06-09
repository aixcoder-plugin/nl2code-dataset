package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation134 extends AbstractBaseEvaluation {
    public Evaluation134(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {

        long[] expectedReturn = new long[]{0,Long.MAX_VALUE,Long.MIN_VALUE,Long.MAX_VALUE,Long.MIN_VALUE};
        long[] inputParam = new long[]{0,Long.MAX_VALUE,Long.MIN_VALUE,Long.MIN_VALUE,Long.MAX_VALUE};
        double[] inputParam2 = new double[]{1.2343274d, 2.01d, 2.0d,-2.01d,-2.01d};
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
                e.printStackTrace();
            }
        }

        return new int[]{pass_count, total_count};
    }
}
