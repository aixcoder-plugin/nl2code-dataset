package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation29 extends AbstractBaseEvaluation {


    public Evaluation29(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        double[][] params1 = {
                {1, 1},
                {-1, -1},
                {0, 0},
                {2.5, 3.75},
                {Double.POSITIVE_INFINITY, 0}
        };
        double[][] params2 = {
                {1, -1},
                {-1, -1},
                {4, 3},
                {-0.5, -0.25},
                {0, Double.POSITIVE_INFINITY}
        };
        double[][] params3 = {
                {2},
                {0},
                {5},
                {5},
                {Double.POSITIVE_INFINITY}
        };

        int pass_count = 0;
        for (int i = 0; i < params1.length; i++) {
            try {
                if (solution.euclideanDistance(params1[i], params2[i]) == params3[i][0]) {
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }

        return new int[]{pass_count, params1.length};
    }
}
