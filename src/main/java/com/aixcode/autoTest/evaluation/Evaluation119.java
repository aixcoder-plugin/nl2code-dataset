package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation119 extends AbstractBaseEvaluation {

    public Evaluation119(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    Map<Double,String> map=new HashMap<>(){{
        put(1.1231,"1.12");
        put(3.40001,"3.40");
        put(-2.5322,"-2.53");
        put(-0.011,"-0.01");
    }};

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for (Map.Entry<Double, String> entry : map.entrySet()){
            try {
                String result = solution.formatDouble(entry.getKey());
                if (entry.getValue().equals(result)) {
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
