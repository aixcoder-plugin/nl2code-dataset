package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation121 extends AbstractBaseEvaluation {

    public Evaluation121(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String,Integer> map = new HashMap<>(){{
            put("",-1);
            put("/users",0);
            put("users/com",5);
            put("pass/",4);
            put("emails/to", 6);
        }};
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                if (solution.getNextSlash(entry.getKey(), 0) == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
