package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluation28 extends AbstractBaseEvaluation {


    public Evaluation28(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Integer> map = new HashMap<String, Integer>(){{
            put("a",1);
            put("a,b",2);
            put("a,b,c",3);
            put("a,b,c,d",4);
            put("a,b,c,d,e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                List<String> list  = solution.split(entry.getKey(),",");
                if (null!=list && list.size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{pass_count,map.size()};
    }
}
