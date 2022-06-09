package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation98 extends AbstractBaseEvaluation {
    Map<String,String> map=new HashMap<>(){
        {
            put("&Look && Feel","Look & Feel");
            put("bg&&","bg&");
            put("&cdjfas;d","cdjfas;d");
            put("sa_19dsajfasd","sa_19dsajfasd");
            put("&&______&&______","&______&______");
        }
    };

    public Evaluation98(String basePackage, String prefix) {
        super(basePackage, prefix);
    }

    @Override
    public int[] evaluation() {
        int pass_count = 0;
        for(Map.Entry<String,String> entry:map.entrySet()){
            try{
                if(solution.convertMnemonicString(entry.getKey()).equals(entry.getValue())){
                    pass_count++;
                }
            }catch(Exception e){

            }
        }
        return new int[]{pass_count,map.entrySet().size()};
    }
}
