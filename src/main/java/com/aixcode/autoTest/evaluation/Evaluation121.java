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
            put("      ",-1);// not found
            put("/users",0);//first one
            put("users/",5);//last one
            put("users/com",5); //in the middle
            put("/////",0); //many slashes
            put("emails\n\0/", 8); //after particular char
        }};
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            try {
                int result = solution.getNextSlash(entry.getKey(), 0);
                if (result == entry.getValue()){
                    pass_count++;
                }
            }catch (Exception e) {

            }
        }
        return new int[]{pass_count,map.size()};
    }
}
