package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation99 extends AbstractBaseEvaluation {
    Map<Boolean, String> map = new HashMap<>() {
        {
            put(true, "true");
            put(false, "false");
        }
    };
    public Evaluation99(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (Map.Entry<Boolean, String> entry : map.entrySet()) {
            try {
                if (solution.boolToString(entry.getKey()) == entry.getValue()) {
                    pass_count++;
                }
            } catch (Exception e) {

            }
        }
        return new int[]{pass_count, map.entrySet().size()};
    }



}
