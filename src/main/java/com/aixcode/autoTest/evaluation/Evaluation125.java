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
            put("2010-01-01",1); //start day of month
            put("2022-12-31",31); //31 days month
            put("1982-02-28",28);//28 days month
            put("2000-02-29",29);//29 days month
            put("1900-06-02",2);//middle day of month
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
