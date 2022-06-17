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
        Map<String,String> map = new HashMap<String, String>(){{
            put("a",","); //no delimiter to split
            put("a,b",","); //delimiter ',' to split
            put("d,a b,c"," "); //delimiter ' ' to split
            put("a,b,c,d,,,,",",");//got empty string after split
            put(",",",");//nothing but delimiter
            put("",",");//nothing but delimiter
        }};
        Map<String, Integer> expected = new HashMap<String, Integer>(){
            {
                put("a", 1);
                put("a,b", 2);
                put("d,a b,c", 2);
                put("a,b,c,d,,,,", 8);
                put(",", 2);
                put("", 1);
            }
        };
        int pass_count = 0;
        for (Map.Entry<String,String> entry : map.entrySet()){
            try {
                List<String> list  = solution.split(entry.getKey(), entry.getValue());
                if (null!=list && list.size() == expected.get(entry.getKey())){
                    pass_count++;
                }
            }catch (Exception e){
            }
        }
        return new int[]{pass_count,map.size()};
    }
}
