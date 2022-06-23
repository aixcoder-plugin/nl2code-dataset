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
        Map<Integer,Integer> InputMap = new HashMap<>(){{
            put(10,2);
            put(11,3);
            put(0,4);
            put(-6,5);
            put(1,14);
        }};

        Map<Integer,Integer> OutputMap = new HashMap<>(){{
            put(10,10);//能被整除
            put(11,9); //不能被整除
            put(0,0); // 0
            put(-6,-5); // negative value
            put(1,0);
        }};

        for (Map.Entry<Integer,Integer> entry : InputMap.entrySet()){
            try {
                int result = solution.floor(entry.getKey(), entry.getValue());
                if (result == OutputMap.get(entry.getKey())){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,InputMap.size()};
    }
}
