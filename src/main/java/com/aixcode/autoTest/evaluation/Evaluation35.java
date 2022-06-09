package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation35 extends AbstractBaseEvaluation {


    public Evaluation35(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String, Object> params = new HashMap<>();
        params.put("normal", "normal");
        params.put("nullable", null);
        params.put("empty", "");
        params.put("integer", 122);
        params.put("boolean", true);
        int pass_count = 0;

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            try{
                solution.ensureNotNull(entry.getValue());
                if(!entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }catch(Exception e){
                if(entry.getKey().equals("nullable")){
                    pass_count++;
                }
            }
        }

        return new int[]{pass_count,params.entrySet().size()};
    }
}
