package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation19 extends AbstractBaseEvaluation {


    public Evaluation19(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Integer> map = new HashMap<String,Integer>(){{
            put("a=a",1);
            put("a=a&b=b",2);
            put("a=a&b=b&c=c",3);
            put("a=a&b=b&c=c&d=d",4);
            put("a=a&b=b&c=c&d=d&e=e",5);
        }};
        int pass_count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                if (solution.parseQueryString(entry.getKey()).size() == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
