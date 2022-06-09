package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation118 extends AbstractBaseEvaluation {

    public Evaluation118(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<Double,Integer> map = new HashMap<>(){{
            put(1d, 1);
            put(3.4, 4);
            put(-2.5, -2);
            put(-0.001, 0);
            put(-5d, -5);
        }};
        for (Map.Entry<Double, Integer> entry : map.entrySet()){
            try {
                int result = solution.floor(entry.getKey());
                if (result == entry.getValue()) {
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
