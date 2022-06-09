package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation63 extends AbstractBaseEvaluation {


    public Evaluation63(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("ade1990",true);
        map.put("bg",false);
        map.put("cdjfas;d",false);
        map.put("sa_19dsajfasd",true);
        map.put("____________",true);
        int pass_count = 0;

        for(Map.Entry<String,Boolean> entry:map.entrySet()){
            try{
                if(solution.checkUsername(entry.getKey()) == entry.getValue()){
                    pass_count++;
                }
                //assertEquals(checkUsername(entry.getKey()),entry.getValue());
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
