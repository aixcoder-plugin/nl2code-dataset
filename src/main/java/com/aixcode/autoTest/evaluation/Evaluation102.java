package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation102 extends AbstractBaseEvaluation {

    Map<Map<String,String>,Integer> map=new HashMap<Map<String,String>,Integer>() {
        {
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                    put("sa_19dsajfasd", "true");
                    put("____________", "true");
                }
            }, 5);
            put(new HashMap<String, String>() , 0);
            put(new HashMap<String, String>() {
                {
                    put("bg", "false");
                }
            }, 1);
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                }
            }, 3);
            put(new HashMap<String, String>() {
                {
                    put("ade1990", "true");
                    put("bg", "false");
                    put("cdjfas;d", "false");
                    put("____________", "true");
                }
            }, 4);
        }
    };

    public Evaluation102(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(Map.Entry<Map<String,String>,Integer> entry:map.entrySet()){
            try{
                if(solution.size(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
