package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.Map;

public class Evaluation162 extends AbstractBaseEvaluation {
    public Evaluation162(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    public static Map<String, Boolean> map = new java.util.HashMap<>() {
        {
            put("(()", false);
            put("(())()", true);
            put("(()())", true);
            put("(()()))(", false);
            put("", true);
        }
    };

    @Override
    public int[] evaluation() {
        int passCount = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            try {
                if (solution.checkbracket(entry.getKey()) == entry.getValue()) {
                    passCount++;
                }
            } catch (Exception e) {

            }

        }

        return new int[]{passCount, map.size()};
    }
}
