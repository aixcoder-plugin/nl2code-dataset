package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;


public class Evaluation100 extends AbstractBaseEvaluation {
    public Map<String,String> map=new HashMap<>(){
        {
            put("US-ASCII", "US-ASCII");
            put("ISO646-US", "US-ASCII");
            put("utf-8", "UTF-8");
            put("utf-16BE", "UTF-16BE");
        }
    };

    public Evaluation100(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.canonicalEncodingName(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
