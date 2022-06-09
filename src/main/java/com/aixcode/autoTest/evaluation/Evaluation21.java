package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation21 extends AbstractBaseEvaluation {


    public Evaluation21(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Object> map = new HashMap<String,Object>(){{
            put("a","a");
            put("b","b");
            put("c","c");
            put("d","d");
            put("e","e");
        }};
        Map<String,Object> m = new HashMap<String,Object>(){{
            put("c","a");
            put("d","b");
            put("e","c");
            put("f","x");
            put("g","y");
        }};

        int pass_count = 0;

        for(Map.Entry<String,Object> entry:m.entrySet()){
            try{
                if(null == map.get(entry.getKey())){
                    solution.putAdditionalProperty(entry.getKey(),entry.getValue(),map);
                    if (map.get(entry.getKey()).equals(entry.getValue())){
                        pass_count++;
                    }
                }else{
                    Object value = map.get(entry.getKey());
                    solution.putAdditionalProperty(entry.getKey(),entry.getValue(),map);
                    Object newValue = map.get(entry.getKey());
                    if (!value.equals(newValue)){
                        pass_count++;
                    }
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,m.entrySet().size()};
    }
}
