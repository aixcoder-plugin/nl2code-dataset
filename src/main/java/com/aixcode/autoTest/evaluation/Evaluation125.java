package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation125 extends AbstractBaseEvaluation {

    public Evaluation125(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        Map<String,Integer> map = new HashMap<>(){{
            put("2022-06-01",1);
            put("2022-06-02",2);
            put("2022-06-03",3);
            put("2022-06-04",4);
            put("2022-06-05",5);
        }};
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                if (solution.getDaysByMonth(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
