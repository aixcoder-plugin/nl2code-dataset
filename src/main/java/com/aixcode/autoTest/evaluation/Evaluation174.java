package com.aixcode.autoTest.evaluation;

import com.aixcode.autoTest.AbstractBaseEvaluation;

import java.util.HashMap;
import java.util.Map;

public class Evaluation174 extends AbstractBaseEvaluation {
    public Evaluation174(String basePackage, String prefix) {
        super(basePackage, prefix);
    }
    Map<String,Boolean> map=new HashMap<>(){
        {
            put("0x13", true);
            put("0", true);
            put("-12", true);
            put("0.23", false);
            put("1e5", false);
            put("txt", false);

        }
    };

    @Override
    public int[] evaluation() {
        int passCount=0;
        for (Map.Entry<String,Boolean> entry:map.entrySet()) {
            try {
                String numberString = entry.getKey();
                boolean isInteger = solution.isInteger(numberString);
                if (isInteger == entry.getValue()) {
                    passCount++;
                }
            }catch (Exception e){

            }
        }
        return new int[]{passCount,map.size()};
    }
}
