package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

public class Evaluation81 extends AbstractBaseEvaluation {
    public Evaluation81(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    public int[] checkCopilot() {
        return new int[]{1, 2};
    }

    public int[] checkAixcoder() {
        return new int[]{0,2};
    }

    @Override
    public int[] evaluation() {
        return new int[]{0, 0};
    }
}
