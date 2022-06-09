package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation123 extends AbstractBaseEvaluation {

    public Evaluation123(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<Integer,Integer> map = new HashMap<>(){{
            put(10,2);
            put(11,3);
            put(12,4);
            put(13,5);
            put(14,6);
        }};
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            try {
                int result = solution.floor(entry.getKey(), entry.getValue());
                if (result >= entry.getValue() && result % entry.getValue() ==0){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
