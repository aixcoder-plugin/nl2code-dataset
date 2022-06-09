package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.Map;

public class Evaluation171 extends AbstractBaseEvaluation {
    public Evaluation171(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    public Map<String, String> map = new java.util.HashMap<String, String>() {
        {
            put("1.1", "1.1");
            put("1.02", "1.02");
            put("0.0020", "0.002");
            put("-0.0001010", "-0.000101");
            put("-0.010101", "-0.010101");
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                String result = solution.rvZeroAndDot(entry.getKey());
                if (entry.getValue().equals(result)) {
                    passCount++;
                }
            } catch (Exception e) {
            }

        }
        return new int[]{passCount, map.size()};
    }
}
