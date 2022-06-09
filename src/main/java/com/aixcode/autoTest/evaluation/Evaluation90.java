package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Evaluation90 extends AbstractBaseEvaluation {
    Map<String, HashSet<Integer>> map = new HashMap<>(){
        {
            put("F1",new HashSet<>(){
                {
                    add(21);
                }
            });
            put("65",new HashSet<>(){
                {
                    add(32);
                    add(42);
                }
            });
            put("3a",new HashSet<>());
            put("5b",null);
        }
    };
    Map<String,Integer> map2 = new HashMap<>(){
        {
            put("F1",12);
            put("65",32);
            put("3a",1);
            put("dc",21);
            put("5b",5);
        }
    };

    public Evaluation90(String basePackage, String prefix) {
        super(basePackage, prefix);
    }


    @Override
    public int[] evaluation() {
        int passCount=0;
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            try {
                solution.addToSet(map,key,value);
                if (map.get(key).contains(value)){
                    if (key.equals("65")){
                        if(map.get(key).size()==2){
                            passCount++;
                        }
                    }else {
                        passCount++;
                    }

                }
            }catch (Exception e){
            }
        }
        return new int[]{passCount,map2.size()};
    }
}
