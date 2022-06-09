package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;


public class Evaluation110 extends AbstractBaseEvaluation {

    public Evaluation110(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
            Map<String, Float> map = new HashMap<>(){{
            put("0.112", 0.112f);
            put("3.14",3.14f);
            put("234",234f);
            put("12e-3",0.012f);
        }};
        for (Map.Entry<String,Float> entry : map.entrySet()){
            try {
                float modelRes=solution.parseFloat(entry.getKey());
                float targetRes=entry.getValue();
                if(Math.abs(modelRes-targetRes)<0.00001){
                    pass_count++;
                }

            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }

}
